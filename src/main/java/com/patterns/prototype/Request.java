package com.patterns.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Request implements Cloneable{
    private String clientName;
    private int age;
    private String job;

    public Request clone() throws CloneNotSupportedException {
        return (Request) super.clone();
    }
}
