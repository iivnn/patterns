package com.mycompany.patterns.adapter;

public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Target target = new Adapter();
        System.out.println(target.pow(10, 6));
    }
    
}
