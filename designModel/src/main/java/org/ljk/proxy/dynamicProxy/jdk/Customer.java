package org.ljk.proxy.dynamicProxy.jdk;

public class Customer implements IOrder {
    @Override
    public String order(String name) {
        return "下单"+name;
    }

    @Override
    public String test1(String name) {
        return "eat";
    }

    @Override
    public String test2(String name) {
        return "drink";
    }
}
