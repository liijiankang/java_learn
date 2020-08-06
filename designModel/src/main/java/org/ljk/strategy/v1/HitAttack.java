package org.ljk.strategy.v1;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 18:07
 */
public class HitAttack implements Attackable {
    @Override
    public void attack() {
        System.out.println("打");
    }
}
