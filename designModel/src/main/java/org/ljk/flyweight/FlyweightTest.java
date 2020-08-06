package org.ljk.flyweight;

/**
 * @DESCRIPTION:利用共享技术有效的支持大量细粒度的支持
 * 不可变对象，数据一致性等问题
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 14:51
 */
public class FlyweightTest {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1, 2,TreeFactory.getTree("n1","d1"));
        TreeNode treeNode2 = new TreeNode(2, 2,TreeFactory.getTree("n2","d2"));
        TreeNode treeNode3 = new TreeNode(3, 2,TreeFactory.getTree("n1","d1"));
    }
}
