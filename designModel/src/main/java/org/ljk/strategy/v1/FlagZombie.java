package org.ljk.strategy.v1;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 18:03
 */
public class FlagZombie extends Zombie {

    public FlagZombie() {
        super(new StepByStep(),new BiteAttack());
    }

    public FlagZombie(Movable movable, Attackable attackable) {
        super(movable, attackable);
    }

    @Override
    public void display() {
        System.out.println("棋手僵尸");
    }

    @Override
    void move() {
        movable.move();
    }

    @Override
    void attack() {
        attackable.attack();
    }
}
