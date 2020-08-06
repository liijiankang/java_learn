package org.ljk.singleton.hungery;

/**
 * @DESCRIPTION:类加载的时候完成实例的初始化工作
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 8:54
 */
public class HungerSingleton {

    private static HungerSingleton instance = new HungerSingleton();

    private HungerSingleton() {
    }

    public static HungerSingleton getInstance(){
        return instance;
    }
}
