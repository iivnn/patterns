package com.mycompany.patterns.bridge;

public class Ice implements DamageType {

    @Override
    public double damageMultiplier() {
        return 1;
    }

    @Override
    public String effect() {
        return "burning";
    }
    
}
