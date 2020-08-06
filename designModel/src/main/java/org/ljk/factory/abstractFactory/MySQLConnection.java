package org.ljk.factory.abstractFactory;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 11:11
 */
public class MySQLConnection implements IConnection {
    @Override
    public void connect() {
        System.out.println("mysql connected.");
    }
}
