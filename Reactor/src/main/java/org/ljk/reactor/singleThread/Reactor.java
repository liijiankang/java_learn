package org.ljk.reactor.singleThread;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.spi.AbstractSelectionKey;
import java.util.Iterator;


/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/14 15:02
 */
public class Reactor implements Runnable {
    private ServerSocketChannel serverSocketChannel;
    private Selector selector;

    public Reactor(int port) {
        try {
            selector = Selector.open();
            serverSocketChannel = ServerSocketChannel.open();
            InetSocketAddress inetSocketAddress = new InetSocketAddress(port);
            serverSocketChannel.socket().bind(inetSocketAddress);
            serverSocketChannel.configureBlocking(false);
            SelectionKey key = serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
            key.attach(new Acceptor(selector, serverSocketChannel));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            System.out.println("receive a new event!");
            try {
                selector.select();
                Iterator<SelectionKey> keyIterator = selector.selectedKeys().iterator();
                while (keyIterator.hasNext()) {
                    SelectionKey selectionKey = keyIterator.next();
                    System.out.println("---------------------------" + selectionKey.attachment().getClass());
                    dispatch(selectionKey);
                    keyIterator.remove();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void dispatch(SelectionKey selectionKey) {
        Runnable attachment = (Runnable) selectionKey.attachment();
        if (attachment != null) {
            attachment.run();
        }
    }

}
