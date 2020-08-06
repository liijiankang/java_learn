package org.ljk.factory.onclass;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 9:15
 */
public class FactoryMethod {
    public static void main(String[] args) {
        Application application = new Application();
        ProductA productA = application.getObject();
        productA.method1();

    }
}

class ProductA{
    //稳定的部分
    public void method1(){
        System.out.println("ProductA.method1");
    }
}

class Application{
    private ProductA createProduct(){
        return new ProductA();
    }
    ProductA getObject(){
        ProductA product = createProduct();
        return product;
    }
}
