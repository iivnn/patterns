package com.mycompany.patterns.factorymethod;

public abstract class Animal {

    private final int legs;

    public Animal(int legs) {
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }
}
