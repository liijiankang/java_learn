package org.ljk.chain;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/11 19:52
 */
public class LoginHandler extends Handler {
    public LoginHandler(Handler handler) {
        super(handler);
    }

    @Override
    boolean process(Request request) {
        System.out.println("login control");
        if (request.loggedOn()){
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
