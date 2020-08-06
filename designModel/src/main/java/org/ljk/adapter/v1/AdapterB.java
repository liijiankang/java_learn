package org.ljk.adapter.v1;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 15:47
 */
public class AdapterB implements Target {

    private AdapterA adapter;

    public AdapterB(AdapterA adapter) {
        this.adapter = adapter;
    }

    @Override
    public int output5v() {
        int output220v = adapter.output220v();
        System.out.println("原始电压：" + output220v + " >>>>>> 5v");
        //转换处理
        //...
        //...
        return 5;
    }
}
