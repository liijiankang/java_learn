package org.ljk.builder;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 13:41
 */
public class Product {
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

    public Product() {
    }

    public Product(String attribute1, String attribute2, String attribute3, String attribute4, String attribute5, String attribute6, String attribute7, String attribute8, String attribute9, String attribute10, String attribute11) {
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
        this.attribute3 = attribute3;
        this.attribute4 = attribute4;
        this.attribute5 = attribute5;
        this.attribute6 = attribute6;
        this.attribute7 = attribute7;
        this.attribute8 = attribute8;
        this.attribute9 = attribute9;
        this.attribute10 = attribute10;
        this.attribute11 = attribute11;
    }

    @Override
    public String toString() {
        return "Product{" +
                "attribute1='" + attribute1 + '\'' +
                ", attribute2='" + attribute2 + '\'' +
                ", attribute3='" + attribute3 + '\'' +
                ", attribute4='" + attribute4 + '\'' +
                ", attribute5='" + attribute5 + '\'' +
                ", attribute6='" + attribute6 + '\'' +
                ", attribute7='" + attribute7 + '\'' +
                ", attribute8='" + attribute8 + '\'' +
                ", attribute9='" + attribute9 + '\'' +
                ", attribute10='" + attribute10 + '\'' +
                ", attribute11='" + attribute11 + '\'' +
                '}';
    }

    //不可变对象
    static class Builder{
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

        public Builder attribute1(String attribute){
            this.attribute1 = attribute;
            return this;
        }
        public Builder attribute2(String attribute){
            this.attribute2 = attribute;
            return this;
        }
        public Builder attribute3(String attribute){
            this.attribute3 = attribute;
            return this;
        }
        //...
        public Product buid(){
            Product product = new Product(this.attribute1, this.attribute2, this.attribute3,this.attribute4, this.attribute5,this.attribute6,this.attribute7,this.attribute8,this.attribute9,this.attribute10,this.attribute11);
            return product;
        }
    }
}
