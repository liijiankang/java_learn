package org.ljk.chain;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/11 19:46
 */
public abstract class Handler {
    Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    public Handler(Handler handler) {
        this.next = handler;
    }

    abstract boolean process(Request request);
}
