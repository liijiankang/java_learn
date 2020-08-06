package org.ljk.factory.factoryMethod;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 10:33
 */
public class ConcreteProductA extends Application {
    @Override
    Product createProduct() {
        //产品细节
        return new ProductA();
    }
}
