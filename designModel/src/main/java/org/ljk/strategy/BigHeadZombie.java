package org.ljk.strategy;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 16:49
 */
public class BigHeadZombie extends AbstractZombie {
    @Override
    public void display() {
        System.out.println("大头");
    }

    @Override
    public void attack() {
        System.out.println("咬人");
    }
}
