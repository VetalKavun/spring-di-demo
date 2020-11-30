package com.study.code.lazy_init;

public class User {

    public User(){
        System.out.println("User constructor");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
