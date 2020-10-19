package com.mycompany.patterns.factorymethod;

public class AnimalFactory implements IAnimalFactory {

    @Override
    public Animal getAnimal(int legs) {
        switch (legs) {
            case 0:
                return new Snake(legs);
            case 2:
                return new Human(legs);
            case 4:
                return new Dog(legs);
            case 8:
                return new Spider(legs);
            default:
                return new Alien(legs);
        }
    }

}
