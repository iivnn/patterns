package com.mycompany.patterns.bridge;

public class Fire implements DamageType{

    @Override
    public double damageMultiplier() {
        return 1.2;
    }

    @Override
    public String effect() {
        return "frezing";
    }
    
}
