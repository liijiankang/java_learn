package org.ljk.strategy.v1;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 18:01
 */
public class StepByStep implements Movable {
    @Override
    public void move() {
        System.out.println("一步一步移动");
    }
}
