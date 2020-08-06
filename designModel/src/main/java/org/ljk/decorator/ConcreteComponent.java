package org.ljk.decorator;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 16:08
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("拍照");
    }
}
