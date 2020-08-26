package org.ljk.proxy.staticProxy;

public class Customer implements IOrder{
    @Override
    public String order(String name) {
        return "下单"+name;
    }
}
