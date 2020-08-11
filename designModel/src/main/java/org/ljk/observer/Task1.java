package org.ljk.observer;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/11 19:32
 */
public class Task1 implements Observer {
    @Override
    public void update(Object o) {
        System.out.println("task1 received:" + o);
    }
}
