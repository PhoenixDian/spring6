package com.phoenixdian.spring6.factory;

public class Fighter extends Weapon{
    @Override
    public void attack() {
        System.out.println("飞机攻击");
    }
}
