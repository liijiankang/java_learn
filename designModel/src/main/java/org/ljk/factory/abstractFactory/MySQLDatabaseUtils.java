package org.ljk.factory.abstractFactory;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 11:12
 */
public class MySQLDatabaseUtils implements IDatabaseUtils{
    @Override
    public IConnection getConnecttion() {
        return new MySQLConnection();
    }

    @Override
    public ICommand getCommand() {
        return new MySQLCommand();
    }
}
