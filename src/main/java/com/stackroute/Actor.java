package com.stackroute;

public class Actor {

    private  String name;
    private int age;
    private int aid;


    public Actor()
    {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public Actor(String name, int age, int aid) {
        this.name = name;
        this.age = age;
        this.aid = aid;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", aid=" + aid +
                '}';
    }

}
