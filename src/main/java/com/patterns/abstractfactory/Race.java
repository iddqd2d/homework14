package com.patterns.abstractfactory;

import lombok.Getter;

@Getter
public class Race {
    private Warrior warrior;

    public Race(RaceFactory factory){
        warrior = factory.createWarrior();
    }
}
