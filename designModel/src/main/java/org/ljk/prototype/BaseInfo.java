package org.ljk.prototype;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 14:33
 */
public class BaseInfo implements Cloneable{
    private String name;

    @Override
    public String toString() {
        return "BaseInfo{" +
                "name='" + name + '\'' +
                '}';
    }

    public BaseInfo() {
    }

    public BaseInfo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


        @Override
    protected BaseInfo clone() throws CloneNotSupportedException {
        return ((BaseInfo) super.clone());
    }

}
