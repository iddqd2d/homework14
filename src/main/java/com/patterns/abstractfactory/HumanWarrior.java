package com.patterns.abstractfactory;

public class HumanWarrior implements Warrior {
    @Override
    public void attack() {
        System.out.println("use human warrior sword");
    }
}
