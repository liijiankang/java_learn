package singleton.hungery;


import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @DESCRIPTION:避免通过序列化创建多个实列
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 9:00
 */
public class HungerySingleSeriable implements Serializable {
    static final long serialVersionUID = 10L;
    private static HungerySingleSeriable instance = new HungerySingleSeriable();

    public static HungerySingleSeriable getInstance() {
        return instance;
    }

    HungerySingleSeriable readResolve() throws ObjectStreamException {
        return instance;
    }

}
