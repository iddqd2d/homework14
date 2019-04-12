package com.patterns.factorymethod;

import com.patterns.adapter.Connect;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectSingleton {
    private static volatile ConnectSingleton instance;
    private Connection connect;

    @SneakyThrows
    private ConnectSingleton() {
        this.connect = DriverManager.getConnection("url");
    }

    public Connection getConnection (){
        return connect;
    }

    public static ConnectSingleton getInstance() {
        ConnectSingleton localInstance = instance;
        if (localInstance == null) {
            synchronized (ConnectSingleton.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new ConnectSingleton();
                }
            }
        }
        return localInstance;
    }
}
