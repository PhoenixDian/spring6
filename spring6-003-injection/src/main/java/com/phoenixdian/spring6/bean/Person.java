package com.phoenixdian.spring6.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {

    private List<String> names;

    private Set<String> address;


    private Properties properties;

    private Map<Integer,String> map;

    @Override
    public String toString() {
        return "Person{" +
                "names=" + names +
                ", address=" + address +
                ", properties=" + properties +
                ", map=" + map +
                '}';
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }
}
