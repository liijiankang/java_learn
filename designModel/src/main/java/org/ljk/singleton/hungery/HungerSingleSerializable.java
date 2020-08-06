package org.ljk.singleton.hungery;


import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @DESCRIPTION:避免通过序列化创建多个实列
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 9:00
 */
public class HungerSingleSerializable implements Serializable {
    static final long serialVersionUID = 10L;
    private static HungerSingleSerializable instance = new HungerSingleSerializable();

    public static HungerSingleSerializable getInstance() {
        return instance;
    }

    HungerSingleSerializable readResolve() throws ObjectStreamException {
        return instance;
    }

}
