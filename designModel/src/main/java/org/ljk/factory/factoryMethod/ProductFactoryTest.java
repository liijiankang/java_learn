package org.ljk.factory.factoryMethod;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 10:35
 */
public class ProductFactoryTest {
    public static void main(String[] args) {
        Application concreteProductA = new ConcreteProductA();
        concreteProductA.createProduct().method();
    }
}
