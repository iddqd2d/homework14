package com.patterns.abstractfactory;

public class ElfRaceFactory implements RaceFactory{
    public Warrior createWarrior() {
        return new ElfWarrior();
    }
}
