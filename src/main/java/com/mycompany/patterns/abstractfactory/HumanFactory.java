package com.mycompany.patterns.abstractfactory;

public class HumanFactory extends Factory {

    @Override
    public MaleAnimal getMale() {
        return new HumanMaleAnimal();
    }

    @Override
    public FemaleAnimal getFemale() {
        return new HumanFemaleAnimal();
    }
}
