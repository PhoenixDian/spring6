package com.phoenixdian.spring6.bean;

public enum Weather {
    SPRING("春"),SUMMER("夏"),AUTUMN("秋"),WINTER("冬");
    private  String desc;

    public String getDesc() {
        return desc;
    }

    Weather(String desc) {
        this.desc = desc;
    }
}
