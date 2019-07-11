package com.stackroute.domain;

public class Actor {
    private String name;
    private String gender;
    private int age;
    public void act()
    {
        System.out.println(this.name+" is acting");
    }

    public Actor setName(String name) {
        this.name = name;
        return this;
    }

    public Actor setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public Actor setAge(int age) {
        this.age = age;
        return this;
    }
}
