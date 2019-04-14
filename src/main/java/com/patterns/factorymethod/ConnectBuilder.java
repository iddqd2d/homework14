package com.patterns.factorymethod;

import lombok.Setter;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;

@Getter
public class ConnectBuilder {
    private String login;
    private String password;
    private String url;

    @SneakyThrows
    public Connection getConnection (){
        return DriverManager.getConnection(url,login,password);
    }

    public static class Builder {
        private ConnectBuilder connectBuilder;

        public Builder() {
            connectBuilder = new ConnectBuilder();
        }

        public Builder setLogin(String login) {
            connectBuilder.login = login;
            return this;
        }

        public Builder setPassword(String password) {
            connectBuilder.password = password;
            return this;
        }

        public Builder setUrl(String url) {
            connectBuilder.url = url;
            return this;
        }

        public ConnectBuilder build() {
            return connectBuilder;
        }
    }
}
