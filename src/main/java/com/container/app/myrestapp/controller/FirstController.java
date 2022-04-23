package com.container.app.myrestapp.controller;

import com.container.app.myrestapp.entity.Human;
import com.container.app.myrestapp.service.HumanService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping(path = "/api/nick")
public class FirstController {

    private static final Logger LOGGER = LoggerFactory.getLogger(FirstController.class);

    @Autowired
    private HumanService humanService;

    @GetMapping("/scrambler/{name}")
    public String getNickname(@PathVariable String name){
        System.out.println("called api with name = " + name);
        return randomizer(name);
    }

    @GetMapping("/allhumans")
    public ResponseEntity<List<Human>> getAllHumans(){
        List<Human> humans = new ArrayList<>();
        try {
            return new ResponseEntity<>(humanService.getAllHumans(), HttpStatus.OK);
        } catch (Exception e){
            LOGGER.error("exception while looking for humanity!", e);
        }

        return new ResponseEntity<List<Human>>(humans, HttpStatus.SERVICE_UNAVAILABLE);
    }

    @PostMapping("/save")
    public ResponseEntity<Integer> saveNickname(@RequestBody Human human){
        int humanId = 0;
        HttpStatus status;
        try {
            humanId = humanService.saveHuman(human);
            status = HttpStatus.OK;
        } catch (Exception e) {
            LOGGER.error("exception while saving humanity!", e);
            status = HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return new ResponseEntity<>(humanId, status);
    }

    @GetMapping("/error")
    public String getError(){
        return "oh my!";
    }

    private String randomizer(String inputString){
        char[] inputCharArray = inputString.toCharArray();
        Random r = new Random();

        for (int i=0; i<inputCharArray.length; i++){
            int randomNum = r.nextInt(inputCharArray.length);
            char temp = inputCharArray[i];
            inputCharArray[i] = inputCharArray[randomNum];
            inputCharArray[randomNum] = temp;
        }

        return new String(inputCharArray);
    }
}