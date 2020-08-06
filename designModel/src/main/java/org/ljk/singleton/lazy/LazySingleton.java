package org.ljk.singleton.lazy;

/**
 * @DESCRIPTION: 延迟加载，只有在使用的时候才会对实列进行初始化
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 8:44
 */
public class LazySingleton {

    private static volatile LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
