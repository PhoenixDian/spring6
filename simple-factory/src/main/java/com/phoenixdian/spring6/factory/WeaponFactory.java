package com.phoenixdian.spring6.factory;

public class WeaponFactory {

    public static Weapon getWeapon(String weaponType){
        if ("TANK".equals(weaponType)){
            return new Tank();
        }else if ("FIGHTER".equals(weaponType)){
            return new Fighter();
        } else if ("DAGGER".equals(weaponType)) {
            return new Dagger();
        }else {
            throw new RuntimeException("不能制造该武器");
        }
    }
}
