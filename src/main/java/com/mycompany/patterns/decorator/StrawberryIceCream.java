package com.mycompany.patterns.decorator;

public class StrawberryIceCream implements IceCream {

    @Override
    public String getDesc() {
        return "strawberry ice cream";
    }

    @Override
    public double getCost() {
        return 6.99;
    }
    
}
