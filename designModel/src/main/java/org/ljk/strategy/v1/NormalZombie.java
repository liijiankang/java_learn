package org.ljk.strategy.v1;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 17:58
 */
public class NormalZombie extends Zombie {
    public NormalZombie(Movable movable, Attackable attackable) {
        super(movable, attackable);
    }

    public NormalZombie() {
        super(new StepByStep(),new BiteAttack());
    }

    @Override
    public void display() {
        System.out.println("普通僵尸");
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
