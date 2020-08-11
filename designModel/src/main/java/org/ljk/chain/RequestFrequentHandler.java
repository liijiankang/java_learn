package org.ljk.chain;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/11 19:48
 */
public class RequestFrequentHandler extends Handler {
    public RequestFrequentHandler(Handler handler) {
        super(handler);
    }

    @Override
    boolean process(Request request) {
        System.out.println("frequent control.");
        if (request.frequentOk()){
            Handler next = getNext();
            if (next == null){
                return true;
            }
            if (!next.process(request)){
                return false;
            }else {
                return true;
            }
        }
        return false;
    }
}
