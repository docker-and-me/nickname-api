package com.container.app.myrestapp.service;

import com.container.app.myrestapp.entity.Human;
import com.container.app.myrestapp.repo.HumanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HumanService {

    @Autowired
    private HumanRepo humanRepo;

    public void saveHuman(Human human){
        humanRepo.save(human);
    }

    public Iterable<Human> getAllHuman(){
        return humanRepo.findAll();
    }
}
