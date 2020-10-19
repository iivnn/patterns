package com.mycompany.patterns.abstractfactory;

public class SnakeFactory extends Factory {

    @Override
    public MaleAnimal getMale() {
        return new SnakeMaleAnimal();
    }

    @Override
    public FemaleAnimal getFemale() {
        return new SnakeFemaleAnimal();
    }

}
