package org.ljk.proxy.dynamicProxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkDynamicProxyTest {
    public static void main(String[] args) {
        final Customer customer = new Customer();
        IOrder iOrder = (IOrder) Proxy.newProxyInstance(
                customer.getClass().getClassLoader(),
                customer.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if (method.getName().endsWith("order")){
                            String invoke = (String) method.invoke(customer, args);
                            return invoke+"b";
                        }else {
                            return null;
                        }
                    }
                });
        //测试
        String banana = iOrder.test1("banana");
        System.out.println(banana);
    }
}
