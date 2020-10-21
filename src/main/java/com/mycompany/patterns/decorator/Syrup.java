package com.mycompany.patterns.decorator;

public class Syrup extends Decorator {

    public Syrup(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String getDesc() {
        return "syrup";
    }

    @Override
    public double getCost() {
        return this.iceCream.getCost() + .99;
    }
    
}
