package com.phoenixdian.factory.method;

public class MyFactory {
    public static WeaponFactory geWeaponFactory(String factoryType){
        if ("TANK".equals(factoryType)){
            return new TankFactory();
        } else if ("DAGGER".equals(factoryType)) {
            return new DaggerFactory();
        }else {
            throw new RuntimeException("无法制造该武器");
        }

    }
}
