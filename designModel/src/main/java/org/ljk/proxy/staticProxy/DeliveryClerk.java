package org.ljk.proxy.staticProxy;

public class DeliveryClerk implements IOrder{

    private IOrder source;

    public DeliveryClerk(IOrder source) {
        this.source = source;
    }

    @Override
    public String order(String name) {
        String banana = source.order("banana");
        System.out.println("proxy!");
        return banana;
    }
}
