package org.ljk.builder;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 13:54
 */
public class DefaultConcreteProductBuilder implements ProductBuilder {
    private String attribute1;
    private String attribute2;
    private String attribute3;
    private String attribute4;
    private String attribute5;
    private String attribute6;
    private String attribute7;
    private String attribute8;
    private String attribute9;
    private String attribute10;
    private String attribute11;

    @Override
    public void builderAttribute1(String attr) {
        this.attribute1 = attr;
    }

    @Override
    public void builderAttribute2(String attr) {
        this.attribute2 = attr;
    }

    @Override
    public void builderAttribute3(String attr) {
        this.attribute3 = attr;
    }

    @Override
    public void builderAttribute4(String attr) {
        this.attribute4 = attr;
    }

    @Override
    public void builderAttribute5(String attr) {
        this.attribute5 = attr;
    }

    @Override
    public void builderAttribute6(String attr) {
        this.attribute6 = attr;
    }

    @Override
    public void builderAttribute7(String attr) {
        this.attribute7 = attr;
    }

    @Override
    public void builderAttribute8(String attr) {
        this.attribute8 = attr;
    }

    @Override
    public void builderAttribute9(String attr) {
        this.attribute8 = attr;
    }

    @Override
    public void builderAttribute10(String attr) {
        this.attribute10 = attr;
    }

    @Override
    public void builderAttribute11(String attr) {
        this.attribute11 = attr;
    }

    @Override
    public Product builder() {
        return new Product(attribute1,  attribute2,  attribute3,  attribute4,  attribute5,  attribute6,  attribute7,  attribute8,  attribute9,  attribute10,  attribute11);
    }
}
