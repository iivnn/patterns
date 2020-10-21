package com.mycompany.patterns.adapter;

public class Adapter implements Target {

    @Override
    public double pow(double v, double exp) {
        return Math.pow(v, exp);
    }
    
    
}
