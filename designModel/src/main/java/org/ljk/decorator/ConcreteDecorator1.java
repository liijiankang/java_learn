package org.ljk.decorator;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 16:09
 */
public class ConcreteDecorator1 extends Decorator {
    public ConcreteDecorator1(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("美颜");
        component.operation();
    }
}
