package com.mycompany.patterns.bridge;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Weapon weapon = new Sword();
        DamageType type = new Fire();
        weapon.damageValue = 50;
        weapon.damageType = type;
        weapon.doDamge();
        
    }
    
}
