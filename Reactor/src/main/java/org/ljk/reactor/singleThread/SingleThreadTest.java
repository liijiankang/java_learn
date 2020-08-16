package org.ljk.reactor.singleThread;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/14 15:45
 */
public class SingleThreadTest {
    public static void main(String[] args) {
        Reactor reactor = new Reactor(18080);
        reactor.run();
    }
}
