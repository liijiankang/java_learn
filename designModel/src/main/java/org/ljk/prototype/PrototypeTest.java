package org.ljk.prototype;

import com.sun.java.browser.net.ProxyServiceProvider;

/**
 * @DESCRIPTION:原型模式
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 14:13
 */
public class PrototypeTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        BaseInfo baseInfo = new BaseInfo("1");
        Product product = new Product("a", "b", "c", "d",baseInfo);
        Product clone = product.clone();
        System.out.println("product:" + product);
        System.out.println("clone:" + clone);
        product.getBaseInfo().setName("2");
        System.out.println("clone:" + clone);
        System.out.println(product==clone);
    }
}
