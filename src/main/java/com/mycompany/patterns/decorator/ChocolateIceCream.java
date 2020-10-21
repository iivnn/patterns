package com.mycompany.patterns.decorator;

public class ChocolateIceCream implements IceCream{

    @Override
    public String getDesc() {
        return "chocolate ice cream";
    }

    @Override
    public double getCost() {
        return 4.99;
    }
    
}
