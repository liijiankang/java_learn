package org.ljk.strategy.v1;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 17:56
 */
public abstract class Zombie  {
    abstract  public void display();
    Movable movable;
    Attackable attackable;
    abstract void move();
    abstract void attack();

    public Zombie(Movable movable, Attackable attackable) {
        this.movable = movable;
        this.attackable = attackable;
    }

    public Zombie() {
    }

    public Movable getMovable() {
        return movable;
    }

    public void setMovable(Movable movable) {
        this.movable = movable;
    }

    public Attackable getAttackable() {
        return attackable;
    }

    public void setAttackable(Attackable attackable) {
        this.attackable = attackable;
    }
}
