package org.ljk.factory.abstractFactory;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 11:11
 */
public class MySQLCommand implements ICommand {
    @Override
    public void execute() {
        System.out.println("mysql command execute.");
    }
}
