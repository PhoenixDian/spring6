package com.phoenixdian.spring6.bean;

public class People {
    private String name;
    private Integer age;
    private Boolean gender;

    public People(String name, Integer age, Boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
