package org.ljk.adapter.v2;

import org.ljk.adapter.v1.AdapterA;
import org.ljk.adapter.v1.Target;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 15:54
 */
public class AdapterC extends AdapterA implements Target {

    @Override
    public int output5v() {
        int i = output220v();
        //...
        //...
        return 5;
    }
}
