package org.ljk.builder;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 14:00
 */
public class Director {

    private ProductBuilder productBuilder;

    public Director(ProductBuilder productBuilder) {
        this.productBuilder = productBuilder;
    }

    //控制建造顺序
    public Product makeProduct(String attribute1, String attribute2, String attribute3, String attribute4, String attribute5, String attribute6, String attribute7, String attribute8, String attribute9, String attribute10, String attribute11){
        productBuilder.builderAttribute1(attribute1);
        productBuilder.builderAttribute2(attribute2);
        return productBuilder.builder();
    }
}
