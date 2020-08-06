package singleton.hungery;

/**
 * @DESCRIPTION:类加载的时候完成实例的初始化工作
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 8:54
 */
public class HungerySingleton {

    private static HungerySingleton instance = new HungerySingleton();

    private HungerySingleton() {
    }

    public static HungerySingleton getInstance(){
        return instance;
    }
}
