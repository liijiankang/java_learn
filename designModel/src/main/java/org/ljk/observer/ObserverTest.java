package org.ljk.observer;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

/**
 * @DESCRIPTION:定义了对象之间一对多依赖，让对各对象同时监听某一个主题对象，当主题对象发生改变时，他的所有依赖者都会收到通知并更新
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/11 19:24
 */
public class ObserverTest {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.addOberver(new Task1());
        subject.addOberver(new Task2());
        subject.notifyObserver("xxxxxxx");
    }
}
