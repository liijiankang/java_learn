package org.ljk.factory.abstractFactory;

public interface IDatabaseUtils {
    IConnection getConnecttion();
    ICommand getCommand();
}
