package com.phoenixdian.spring6.factory;

public class Test {
    public static void main(String[] args) {
        Weapon tank = WeaponFactory.getWeapon("TANK");
        tank.attack();
    }
}
