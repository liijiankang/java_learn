package org.ljk.facade;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 15:33
 */
public class Client2 {
    SubSystemA a = new SubSystemA();
    SubSystemB b = new SubSystemB();
    SubSystemC c = new SubSystemC();
    public void doS(){
        a.method();
        b.method();
        c.method();
    }
}
