package com.patterns.abstractfactory;

public class WarriorRaceFactory implements RaceFactory {
    @Override
    public Warrior createWarrior() {
        return new HumanWarrior();
    }
}
