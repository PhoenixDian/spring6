package com.phoenixdian.spring6.bean;

import java.util.Arrays;

public class Boy {
    private String[] hobby;
    private Girl[] girls;

    private String name;

    @Override
    public String toString() {
        return "Boy{" +
                "hobby=" + Arrays.toString(hobby) +
                ", girls=" + Arrays.toString(girls) +
                ", name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGirls(Girl[] girls) {
        this.girls = girls;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

}
