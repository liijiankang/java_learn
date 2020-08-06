package org.ljk.flyweight;

import jdk.nashorn.internal.runtime.FindProperty;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 14:57
 */
public class Tree {
    private final String name;
    private final String data;


    public Tree(String name, String data) {
        System.out.println("name:" + name + " data:" + data);
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "name='" + name + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
