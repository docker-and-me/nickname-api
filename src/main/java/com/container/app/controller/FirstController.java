package com.container.app.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping(path = "/api")
public class FirstController {

    @GetMapping("/scrambler/{name}")
    public String getAnswer(@PathVariable String name){
        return randomizer(name);
    }

    private String randomizer(String inputString){
        char[] inputCharArray = inputString.toCharArray();
        Random r = new Random();

        for (int i=0; i<inputCharArray.length; i++){
            int randonNum = r.nextInt(inputCharArray.length);
            char temp = inputCharArray[i];
            inputCharArray[i] = inputCharArray[randonNum];
            inputCharArray[randonNum] = temp;
        }

        return new String(inputCharArray);
    }

    @GetMapping("/error")
    public String getError(){
        return "oh my!";
    }
}
