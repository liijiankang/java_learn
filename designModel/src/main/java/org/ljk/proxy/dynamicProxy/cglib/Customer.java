package org.ljk.proxy.dynamicProxy.cglib;

public class Customer {
    public String order(String name) {
        return "下单"+name;
    }

    public String test1(String name) {
        return "eat";
    }

    public String test2(String name) {
        return "drink";
    }
}
