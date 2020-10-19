package com.mycompany.patterns.factory;

import java.util.Scanner;

public class SimpleFactory {

    public static void main(String[] args) {
        WeaponCrafter crafter = new WeaponCrafter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Option -> ");
        String option = scanner.next();
        Weapon weapon = crafter.newInstance(option);
        System.out.println("Weapon type -> " + weapon.getClass().getSimpleName());
    }

}
