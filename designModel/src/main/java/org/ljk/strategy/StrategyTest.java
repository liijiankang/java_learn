package org.ljk.strategy;

/**
 * @DESCRIPTION:策略模式：定义了算法族，分别封装起来，让它们之间可以互相替换，此模式的变换独立于算法的使用者
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 16:18
 */
public class StrategyTest {
    public static void main(String[] args) {
        NormalZombie normalZombie = new NormalZombie();
        FlagZombie flagZombie = new FlagZombie();
        normalZombie.display();
        flagZombie.display();
    }
}
