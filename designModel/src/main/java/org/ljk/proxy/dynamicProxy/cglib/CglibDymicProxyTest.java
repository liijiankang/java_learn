package org.ljk.proxy.dynamicProxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibDymicProxyTest {
    public static void main(final String[] args) {
        final Customer customer = new Customer();
        Customer customerProxy = (Customer) Enhancer.create(customer.getClass(), new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                String invoke = (String) method.invoke(customer, objects);
                return invoke;
            }
        });
        String ljk = customerProxy.order("ljk");
        System.out.println(ljk);
    }
}
