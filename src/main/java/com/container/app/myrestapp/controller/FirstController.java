package com.container.app.myrestapp.controller;

import com.container.app.myrestapp.entity.Human;
import com.container.app.myrestapp.service.HumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping(path = "/api")
public class FirstController {

    @Autowired
    private HumanService humanService;

    @GetMapping("/scrambler/{name}")
    public String getAnswer(@PathVariable String name){
        System.out.println("called api with name = " + name);
        return randomizer(name);
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

        int id = r.nextInt(100);
        Iterable<Human> humans = humanService.getAllHuman();

        for(Human human : humans){
            System.out.println(human.getFullName());
        }
        //humanService.saveHuman(new Human(4, "new"));

        return new String(inputCharArray);
    }

    @GetMapping("/error")
    public String getError(){
        return "oh my!";
    }
}
