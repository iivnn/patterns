package com.mycompany.patterns.decorator;

public abstract class Decorator implements IceCream {
    
    protected IceCream iceCream;

    public Decorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }
}
