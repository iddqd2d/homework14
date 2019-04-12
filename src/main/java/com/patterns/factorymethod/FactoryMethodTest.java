package com.patterns.factorymethod;

import java.sql.Connection;

public class FactoryMethodTest {
    public static void main(String[] args) {
        FactoryMethod factoryMethod = new FactoryMethod();
        Connection connection = factoryMethod.getConnection(TypeConnect.BUILDER);
    }
}
