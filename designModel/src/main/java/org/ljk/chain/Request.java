package org.ljk.chain;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/11 19:40
 */
public class Request {
    private boolean loggedOn;
    private boolean frequentOk;
    private boolean isPermit;
    private boolean containSensitiveWords;
    private String requestBody;

    public Request(boolean loggedOn, boolean frequentOk, boolean isPermit, boolean containSensitiveWords) {
        this.loggedOn = loggedOn;
        this.frequentOk = frequentOk;
        this.isPermit = isPermit;
        this.containSensitiveWords = containSensitiveWords;
    }

    static class RequestBuilder{
        private boolean loggedOn;
        private boolean frequentOk;
        private boolean isPermit;
        private boolean containSensitiveWords;

        RequestBuilder loggedOn(boolean loggedOn){
            this.loggedOn = loggedOn;
            return this;
        }
        RequestBuilder frequentOk(boolean frequentOk){
            this.frequentOk = frequentOk;
            return this;
        }
        RequestBuilder isPermit(boolean isPermit){
            this.isPermit = isPermit;
            return this;
        }
        RequestBuilder containSensitiveWords(boolean containSensitiveWords){
            this.containSensitiveWords = containSensitiveWords;
            return this;
        }

        public Request build(){
            Request request = new Request(loggedOn, frequentOk, isPermit, containSensitiveWords);
            return request;
        }
    }

    public boolean loggedOn(){
        return loggedOn;
    }
    public boolean frequentOk(){
        return frequentOk;
    }
    public boolean isPermit(){
        return isPermit;
    }
    public boolean containSensitiveWords(){
        return containSensitiveWords;
    }
}
