package org.ljk.decorator;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 16:08
 */
public abstract class Decorator implements Component{
    Component component;

    public Decorator(Component component) {
        this.component = component;
    }
}
