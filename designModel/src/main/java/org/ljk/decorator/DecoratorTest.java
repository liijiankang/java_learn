package org.ljk.decorator;

/**
 * @DESCRIPTION:装饰器模式：在不改变原有对象的基础上，将新功能附加到对象上
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 16:06
 */
public class DecoratorTest {
    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        concreteComponent.operation();
        ConcreteDecorator1 concreteDecorator1 = new ConcreteDecorator1(new ConcreteComponent());
        concreteDecorator1.operation();
        ConcreteDecorator2 concreteDecorator2 = new ConcreteDecorator2(new ConcreteDecorator1(new ConcreteComponent()));
        concreteDecorator2.operation();
    }
}
