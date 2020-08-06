package org.ljk.factory.onclass;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 9:15
 */
public class FactoryMethod2 {
    public static void main(String[] args) {
        Application2 application = new Application2();
        Product productA = application.getObject("2");
        productA.method1();

    }
}

interface Product {
    void method1();
}

class ProductA2 implements Product {
    //稳定的部分
    public void method1(){
        System.out.println("ProductA2.method1");
    }
}

class ProductA1 implements Product {
    //稳定的部分
    public void method1() {
        System.out.println("ProductA1.method1");
    }
}


//应用程序
class Application2{
    private Product createProduct(String type){
        return SimpleFactory.createProduct(type);
    }
    Product getObject(String type){
        Product product = createProduct(type);
        return product;
    }
}

//编程习惯，不算是模式
class SimpleFactory{
        public static Product createProduct(String type){
            if (type == "1"){
                return new ProductA1();
            }else if (type == "2"){
                return new ProductA2();
            }else {
                return null;
            }
        }
}

