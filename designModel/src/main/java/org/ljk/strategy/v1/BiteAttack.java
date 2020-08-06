package org.ljk.strategy.v1;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 18:02
 */
public class BiteAttack implements Attackable {
    @Override
    public void attack() {
        System.out.println("咬");
    }
}
