package org.ljk.strategy;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 16:21
 */
public abstract class AbstractZombie {
    public abstract void display();
    public void attack(){
        System.out.println("攻击");
    }
    public void move(){
        System.out.println("移动一步");
    }
}
