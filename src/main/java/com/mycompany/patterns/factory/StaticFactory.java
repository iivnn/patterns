package com.mycompany.patterns.factory;

import java.util.Scanner;

class Weapon {

    String name;
    double damage;
}

class Sword extends Weapon {
}

class Gun extends Weapon {

    int ammo;
}

class Staff extends Weapon {

    String element;
}

class WeaponCrafter {

    public static Weapon getInstance(String type) {
        switch (type.toLowerCase()) {
            case "staff":
                return new Staff();
            case "gun":
                return new Gun();
            case "sword":
                return new Sword();
            default:
                return new Weapon();
        }
    }

    public Weapon newInstance(String type) {
        switch (type.toLowerCase()) {
            case "staff":
                return new Staff();
            case "gun":
                return new Gun();
            case "sword":
                return new Sword();
            default:
                return new Weapon();
        }
    }
}

public class StaticFactory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Option -> ");
        String option = scanner.next();
        Weapon weapon = WeaponCrafter.getInstance(option);
        System.out.println("Weapon type -> " + weapon.getClass().getSimpleName());
    }

}
