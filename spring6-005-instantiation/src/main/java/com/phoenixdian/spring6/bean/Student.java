package com.phoenixdian.spring6.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private Date birth;

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(birth);
        return "Student{" +
                "birth='" + format + '\'' +
                '}';
    }
}
