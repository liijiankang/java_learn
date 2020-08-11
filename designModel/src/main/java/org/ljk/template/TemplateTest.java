package org.ljk.template;

/**
 * @DESCRIPTION:定义一个操作的算法骨架，而将一些步骤延迟到子类中，使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/11 19:13
 */
public class TemplateTest {
    public static void main(String[] args) {
        AbstractTemplate abstractTemplate = new SubTampalte2();
        abstractTemplate.operation();
    }
}
