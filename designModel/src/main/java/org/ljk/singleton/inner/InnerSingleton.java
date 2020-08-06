package org.ljk.singleton.inner;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 8:58
 */
public class InnerSingleton {
    private InnerSingleton() {
    }

    public static InnerSingleton getInstance() {
        return InnerClass.instance;
    }

    private static class InnerClass {
        private static InnerSingleton instance = new InnerSingleton();
    }
}
