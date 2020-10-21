package com.mycompany.patterns.bridge;

public abstract class Weapon {
    
    public DamageType damageType;
    public int damageValue;
    
    public void doDamge(){
        System.out.println("damage ->" + this.damageValue*this.damageType.damageMultiplier());
        System.out.println("effect ->" + this.damageType.effect());
    }
    
}
