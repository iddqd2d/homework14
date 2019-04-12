package com.patterns.factorymethod;

import java.sql.Connection;

public class FactoryMethod {
    private static final String LOGIN = "login";
    private static final String PASSWORD = "password";
    private static final String URL = "url";

    public Connection getConnection(TypeConnect typeConnect) {
        Connection connection = null;
        switch (typeConnect) {
            case BUILDER:
                connection = new ConnectBuilder.Builder()
                        .setLogin(LOGIN)
                        .setPassword(PASSWORD)
                        .setUrl(URL)
                        .build()
                        .getConnection();
                break;
            case SINGLETON:
                connection = ConnectSingleton
                        .getInstance()
                        .getConnection();
        }
        return connection;
    }
}
