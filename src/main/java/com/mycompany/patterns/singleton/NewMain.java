package com.mycompany.patterns.singleton;

public class NewMain {

    public static void main(String[] args) {
        double[] values = {56.7, 67.9, 45.9, 23.678};
        MathTools math = MathTools.getInstance();
        double sum = math.sum(values);
        double diff = math.diff(values);
        System.out.println("Sum => " + sum);
        System.out.println("Diff => " + diff);
    }

}
