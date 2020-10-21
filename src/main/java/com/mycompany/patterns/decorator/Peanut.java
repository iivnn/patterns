package com.mycompany.patterns.decorator;

public class Peanut extends Decorator{

    public Peanut(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDesc() {
        return "peanut";
    }

    @Override
    public double getCost() {
        return this.iceCream.getCost() + 1.99;
    }
    
}
