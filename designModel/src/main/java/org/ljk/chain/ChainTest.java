package org.ljk.chain;

/**
 * @DESCRIPTION:为请求创建了一个接收者对象的链
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/11 19:36
 */
public class ChainTest {
    public static void main(String[] args) {
        Request request = new Request.RequestBuilder().frequentOk(true).loggedOn(false).build();
        RequestFrequentHandler requestFrequentHandler = new RequestFrequentHandler(new LoginHandler(null));
        if (requestFrequentHandler.process(request)) {
            System.out.println("正常业务处理");
        }else {
            System.out.println("error");
        }

    }
}
