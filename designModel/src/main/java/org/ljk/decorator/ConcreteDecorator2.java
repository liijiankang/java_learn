package org.ljk.decorator;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 16:13
 */
public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("滤镜");
        component.operation();
    }
}
