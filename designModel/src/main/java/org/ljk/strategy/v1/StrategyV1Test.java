package org.ljk.strategy.v1;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 18:05
 */
public class StrategyV1Test {
    public static void main(String[] args) {
        Zombie zombie = new NormalZombie();
        zombie.display();
        zombie.attack();
        zombie.move();
        zombie.setAttackable(new HitAttack());
        zombie.attack();
    }
}
