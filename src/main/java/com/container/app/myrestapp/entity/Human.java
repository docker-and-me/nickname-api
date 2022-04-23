package com.container.app.myrestapp.entity;

import javax.persistence.*;

@Entity
@Table (name = "humans")
public class Human {
    private int id;
    private String fullName;
    private String nickName;

    public Human(){}

    public Human(String fullName, String nickName){
        this.fullName = fullName;
        this.nickName = nickName;
    }

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "fullname", nullable = false )
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Column(name = "nickname", nullable = false )
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        if (nickName == null || "".equals(nickName)){
            this.nickName = getFullName();
        }
        this.nickName = nickName;
    }

    @Override
    public String toString(){
        return "Human [ id = " + this.id + ", fullname = " + this.fullName + "]";
    }
}