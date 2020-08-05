package org.ljk;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/5 14:07
 */
public class Server {
    private ServerSocketChannel acceptChannel = null; //the accept channel
    private Selector selector = null; //the selector that we use for the server
    private int port = 18080;
    private boolean running = true;

    public Server() {
        try {
            this.selector = Selector.open();
            this.acceptChannel = ServerSocketChannel.open();
            acceptChannel.socket().bind(new InetSocketAddress(port));
            //设置非阻塞
            acceptChannel.configureBlocking(false);
            //接收连接请求
            acceptChannel.register(selector, SelectionKey.OP_ACCEPT);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void listener() {
        System.out.println(String.format("-----------主线程：%s ,监听连接请求", Thread.currentThread().getName()));
        try {
            while (running) {
                //这里会阻塞，没有连接得话会一直阻塞到这里
                selector.select();
                Iterator<SelectionKey> it = selector.selectedKeys().iterator();
                while (it.hasNext()) {
                    SelectionKey key = it.next();
                    //处理OP_ACCEPT类型事件
                    if (key.isAcceptable()) {
                        doAccept(key);
                    }
                    it.remove();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void doAccept(SelectionKey key) {
        ServerSocketChannel server = (ServerSocketChannel) key.channel();
        SocketChannel channel;
        try {
            SocketChannel socketChannel = server.accept();
            socketChannel.configureBlocking(false);
            System.out.println(String.format("------------------%s:上线", socketChannel.getRemoteAddress()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
