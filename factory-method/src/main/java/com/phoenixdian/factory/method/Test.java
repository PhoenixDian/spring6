package com.phoenixdian.factory.method;

public class Test {
    public static void main(String[] args) {
        DaggerFactory daggerFactory = new DaggerFactory();
        Weapon dagger = daggerFactory.getWeapon();
        dagger.attack();
        TankFactory tankFactory = new TankFactory();
        Weapon tank = tankFactory.getWeapon();
        tank.attack();

        Weapon tank1 = MyFactory.geWeaponFactory("TANK").getWeapon();
        tank1.attack();
    }
}
