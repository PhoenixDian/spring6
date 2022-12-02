package com.phoenixdian.factory.method;

public class DaggerFactory extends WeaponFactory{
    @Override
    public Weapon getWeapon() {
        return new Dagger();
    }
}
