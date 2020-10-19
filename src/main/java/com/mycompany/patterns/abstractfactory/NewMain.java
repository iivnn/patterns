package com.mycompany.patterns.abstractfactory;

import java.util.List;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SnakeFactory sf = new SnakeFactory();
        MaleAnimal msnake = sf.getMale();
        FemaleAnimal fsnake = sf.getFemale();
        System.out.println("male snake -> " + msnake.getClass().getSimpleName());
        System.out.println("female snake -> " + fsnake.getClass().getSimpleName());
        List<Animal> couple = new HumanFactory().getCouple();
        System.out.println("1st human -> " + couple.get(0).getClass().getSimpleName());
        System.out.println("2nd human -> " + couple.get(1).getClass().getSimpleName());
        
        
    }
    
}
