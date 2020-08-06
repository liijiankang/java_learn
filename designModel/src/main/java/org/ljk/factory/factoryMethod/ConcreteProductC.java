package org.ljk.factory.factoryMethod;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 10:34
 */
public class ConcreteProductC extends Application {
    @Override
    Product createProduct() {
        return new ProductC();
    }
}
