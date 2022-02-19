package com.container.app.myrestapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "humans")
public class Human {
    private int id;
    private String fullName;

    public Human(){}

    public Human(int id, String name){
        this.id = id;
        this.fullName = name;
    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false )
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString(){
        return "Human [ id = " + this.id + ", fullname = " + this.fullName + "]";
    }
}