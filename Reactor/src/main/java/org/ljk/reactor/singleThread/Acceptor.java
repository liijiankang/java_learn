package org.ljk.reactor.singleThread;

import java.io.IOException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/14 15:02
 */
public class Acceptor implements Runnable {
    private Selector selector;
    private ServerSocketChannel serverSocketChannel;

    public Acceptor(Selector selector, ServerSocketChannel serverSocketChannel) {
        this.selector = selector;
        this.serverSocketChannel = serverSocketChannel;
    }

    @Override
    public void run() {
        try {
            SocketChannel socketChannel = serverSocketChannel.accept();
            if (socketChannel != null) {
                System.out.println(String.format("%s connected.", socketChannel.getRemoteAddress()));
                socketChannel.configureBlocking(false);
                SelectionKey key = socketChannel.register(selector, SelectionKey.OP_READ);
                selector.wakeup();
                key.attach(new Handler(key, socketChannel));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
