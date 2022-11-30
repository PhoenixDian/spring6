package com.phoenixdian.spring6.bean;

import java.util.Date;

public class SimpleClassType {

    /*public static boolean isSimpleValueType(Class<?> type) {
        return (Void.class != type && void.class != type &&
                (ClassUtils.isPrimitiveOrWrapper(type) ||
                        Enum.class.isAssignableFrom(type) ||
                        CharSequence.class.isAssignableFrom(type) ||
                        Number.class.isAssignableFrom(type) ||
                        Date.class.isAssignableFrom(type) ||
                        Temporal.class.isAssignableFrom(type) ||
                        URI.class == type ||
                        URL.class == type ||
                        Locale.class == type ||
                        Class.class == type));
    }*/

    //测试简单类型
    private int i = 1;
    private Integer Ii = 1;
    private char c = 'a';
    private Character Cc = 'A';
    private boolean b = false;
    private Boolean Bb = false;
    private Class clazz;

    private Date birthday;

    @Override
    public String toString() {
        return "SimpleClassType{" +
                "i=" + i +
                ", Ii=" + Ii +
                ", c=" + c +
                ", Cc=" + Cc +
                ", b=" + b +
                ", Bb=" + Bb +
                ", clazz=" + clazz +
                ", birthday=" + birthday +
                ", weather=" + weather +
                ", userName='" + userName + '\'' +
                '}';
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setIi(Integer ii) {
        Ii = ii;
    }

    public void setCc(Character cc) {
        Cc = cc;
    }

    public void setBb(Boolean bb) {
        Bb = bb;
    }

    private Weather weather;
    private String userName;

    public void setI(int i) {
        this.i = i;
    }



    public void setC(char c) {
        this.c = c;
    }



    public void setB(boolean b) {
        this.b = b;
    }



    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
