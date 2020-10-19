package com.mycompany.patterns.singleton;

public class MathTools {

    private static MathTools mathTools;
    public static final double PI = Math.PI;

    private MathTools() {
    }

    public static MathTools getInstance() {
        if (mathTools == null) {
            mathTools = new MathTools();
        }
        return mathTools;
    }

    public double sum(double... numbers) {
        double result = 0;
        for (int counter = 0; counter < numbers.length; counter++) {
            result += numbers[counter];
        }
        return result;
    }

    public double diff(double... numbers) {
        double result = 0;
        for (int counter = 0; counter < numbers.length; counter++) {
            result -= numbers[counter];
        }
        return result;
    }

}
