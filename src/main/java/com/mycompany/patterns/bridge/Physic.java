package com.mycompany.patterns.bridge;

public class Physic implements DamageType {

    @Override
    public double damageMultiplier() {
        return 1.3;
    }

    @Override
    public String effect() {
        return "bleeding";
    }
    
    
    
}
