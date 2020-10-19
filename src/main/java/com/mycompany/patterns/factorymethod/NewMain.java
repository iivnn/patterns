package com.mycompany.patterns.factorymethod;

import java.util.Scanner;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AnimalFactory fact = new AnimalFactory();
        Scanner sc = new Scanner(System.in);
        System.out.println("Legs count -> ");
        int count = sc.nextInt();
        Animal animal = fact.getAnimal(count);
        System.out.println("You did a -> " + animal.getClass().getSimpleName());
    }
    
}
