package com.phoenixdian.factory.method;

public class TankFactory extends WeaponFactory{
    @Override
    public Weapon getWeapon() {
        return new Tank();
    }
}
