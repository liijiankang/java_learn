package org.ljk.proxy.staticProxy;

public class StaticProxyTest {
    public static void main(String[] args) {
        IOrder deliveryClerk = new DeliveryClerk(new Customer());
        String m = deliveryClerk.order("m");
        System.out.println(m);
    }
}
