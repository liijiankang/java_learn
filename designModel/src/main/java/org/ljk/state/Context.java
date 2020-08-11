package org.ljk.state;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/11 20:38
 */
public class Context {
    private State state;
    public void changeState(State state){
        this.state = state;
    }
    public void doSomething(){
        state.doWork();
    }
}
