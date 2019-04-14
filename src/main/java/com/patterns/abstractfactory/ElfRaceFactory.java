package com.patterns.abstractfactory;

public class ElfRaceFactory implements RaceFactory{
    @Override
    public Warrior createWarrior() {
        return new ElfWarrior();
    }
}
