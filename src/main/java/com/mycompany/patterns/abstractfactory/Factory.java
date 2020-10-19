package com.mycompany.patterns.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public abstract class Factory {

    public abstract MaleAnimal getMale();

    public abstract FemaleAnimal getFemale();
    
    public List<Animal> getCouple() {
        List<Animal> list = new ArrayList<>();
        list.add(getMale());
        list.add(getFemale());
        return list;
    }

}
