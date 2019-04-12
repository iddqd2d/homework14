package com.patterns.prototype;

import lombok.SneakyThrows;

public class Solution {

    @SneakyThrows
    public static void main(String[] args) {
        Request request = new Request("Joe", 22, "developer");
        Request cloneRequest = request.clone();
        cloneRequest.setAge(24);
        System.out.println(cloneRequest);
    }
}
