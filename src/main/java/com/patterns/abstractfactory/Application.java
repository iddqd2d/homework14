package com.patterns.abstractfactory;

public class Application {
    public static void main(String[] args) {
        Race elfRace = new Race(new ElfRaceFactory());
        Race warriorRace = new Race(new WarriorRaceFactory());
        Warrior elfWarrior = elfRace.getWarrior();
        Warrior humanWarrior = warriorRace.getWarrior();
    }
}
