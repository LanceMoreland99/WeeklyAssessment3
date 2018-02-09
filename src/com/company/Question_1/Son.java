package com.company.Question_1;

public class Son extends Parent{

    private int age;
    private String name;

    public Son(String eyeColor, String haircolor, int age, String name) {
        super(eyeColor, haircolor);
        this.age = age;
        this.name = name;
    }

    public Son(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Son() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
