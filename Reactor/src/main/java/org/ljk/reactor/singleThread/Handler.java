package org.ljk.reactor.singleThread;


import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/14 15:02
 */
public class Handler implements Runnable {
    private SelectionKey selectionKey;
    private SocketChannel socketChannel;

    private ByteBuffer readBuffer = ByteBuffer.allocate(1024);
    private ByteBuffer sendBuffer = ByteBuffer.allocate(1024);

    private final static int READ = 0;
    private final static int SEND = 1;
    private int status = READ;

    public Handler(SelectionKey selectionKey, SocketChannel socketChannel) {
        this.selectionKey = selectionKey;
        this.socketChannel = socketChannel;
    }

    @Override
    public void run() {
        if (status == 1) {
            send();
        } else if (status == 0) {
            read();
        } else {
            System.out.println("state !=0/1 ");
        }
    }

    private void send() {
        System.out.println("write...");
        try {
            sendBuffer.clear();
            sendBuffer.put(String.format("send message to %s ! \r\n", socketChannel.getRemoteAddress()).getBytes());
            sendBuffer.flip();
            int w = socketChannel.write(sendBuffer);
            if (w < 0) {
                selectionKey.cancel();
                socketChannel.close();
                return;
            }
            status = READ;
            selectionKey.interestOps(SelectionKey.OP_READ);
            selectionKey.selector().wakeup();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void read() {
        System.out.println("read...");
        try {
            readBuffer.clear();
            int r = socketChannel.read(readBuffer);
            if (r > 0) {
                System.out.println(String.format("read message:%s", new String(readBuffer.array())));
                status = SEND;
                selectionKey.interestOps(SelectionKey.OP_WRITE);
                selectionKey.selector().wakeup();
            } else {
                System.out.println("connect has been closed!");
                selectionKey.cancel();
                socketChannel.close();
                return;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
