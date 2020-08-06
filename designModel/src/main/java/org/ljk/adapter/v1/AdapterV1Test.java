package org.ljk.adapter.v1;

/**
 * @DESCRIPTION:对象的适配器模式，使用的是组合的方式
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 15:51
 */
public class AdapterV1Test {
    public static void main(String[] args) {
        AdapterA adapterA = new AdapterA();
        Target target = new AdapterB(adapterA);
        target.output5v();
    }
}
