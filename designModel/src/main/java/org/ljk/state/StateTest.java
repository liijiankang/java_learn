package org.ljk.state;

/**
 * @DESCRIPTION:允许一个对象在其内部状态发生改变时改变它的行为，对象看起来似乎修改了它的类
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/11 20:33
 */
public class StateTest {
    public static void main(String[] args) {
        Context context = new Context();
        context.changeState(new HappyState());
        context.doSomething();
        context.changeState(new SadState());
        context.doSomething();
    }
}
