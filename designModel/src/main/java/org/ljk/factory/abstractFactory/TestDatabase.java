package org.ljk.factory.abstractFactory;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 11:09
 */
public class TestDatabase {
    public static void main(String[] args) {
        IDatabaseUtils iDatabaseUtils = new MySQLDatabaseUtils();
        IConnection connecttion = iDatabaseUtils.getConnecttion();
        connecttion.connect();
        ICommand command = iDatabaseUtils.getCommand();
        command.execute();
    }
}
