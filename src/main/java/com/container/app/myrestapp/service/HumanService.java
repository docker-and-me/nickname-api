package com.container.app.myrestapp.service;

import com.container.app.myrestapp.entity.Human;
import com.container.app.myrestapp.repo.HumanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HumanService {

    @Autowired
    private HumanRepo humanRepo;

    public int saveHuman(Human human){
        Human newHuman = humanRepo.save(human);
        System.out.println(newHuman.getFullName());
        System.out.println(newHuman.getId());
        return newHuman.getId();
    }

    public List<Human> getAllHumans(){
        List<Human> humans = new ArrayList<>();
        Iterable<Human> iHumans = humanRepo.findAll();

        for (Human human : iHumans){
            humans.add(human);
        }
        return humans;
    }
}
