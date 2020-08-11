package org.ljk.observer;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/11 19:32
 */
public class Task2 implements Observer {
    @Override
    public void update(Object o) {
        System.out.println("task2 received:" + o);
    }
}
