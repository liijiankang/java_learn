package org.ljk.com;

/**
 * 创建RBKree，定义颜色
 * 创建RBNode
 * 辅助方法定义
 * 左旋、右旋方法定义
 * 公开插入方法定义
 * 私有插入方法定义
 * 修正由于插入操作导致的红黑树失衡方法定义
 * 测试红黑树的正确性
 *
 * @param <K>
 * @param <V>
 */
public class MyRBTree<K extends Comparable<K>, V> {

    private RBNode<K, V> rootNode;
    private static final boolean RED = false;
    private static final boolean BLACK = true;

    public RBNode<K, V> getRootNode() {
        return rootNode;
    }

    public int size(RBNode<K, V> node){
        if (node == null){
            return 0;
        }else {
            return node.subTree;
        }
    }
    public int size(){
        return this.rootNode.subTree;
    }

    public boolean isEmpty(){
        return this.rootNode==null;
    }

    /**
     * 根据key获取value
     */
    public V get(K key){
        return get(this.rootNode,key);
    }
    private V get(RBNode<K, V> node,K key){
        if (node!=null){
            int compare = key.compareTo(node.key);
            if (compare<0){
                node = node.leftChild;
            }else if (compare> 0 ){
                node=node.rightChild;
            }else {
                return node.value;
            }
        }
        return null;
    }

    /**
     * 树中是否包含kv对
     */
    public boolean contains(K key){
        return get(key)!=null;
    }
    /**
     * 给定节点的子节点是否包含kv对
     */
    public boolean contains(RBNode<K, V> node,K key){
        return get(node,key)!=null;
    }









    /**
     * 获取父节点
     *
     * @param <K>
     * @param <V>
     */
    public RBNode<K, V> parentOf(RBNode<K, V> node) {
        if (node != null) {
            return node.parent;
        }
        return null;
    }

    /**
     * 是否为红色
     *
     * @param node
     * @return
     */
    public boolean isRed(RBNode<K, V> node) {
        return (node != null && node.color == RED) ? true : false;
    }

    /**
     * 是否为黑色
     *
     * @param node
     * @return
     */
    public Boolean isBlack(RBNode<K, V> node) {
        return !isRed(node);
    }

    /**
     * 设置红色
     *
     * @param node
     */
    public void setRed(RBNode<K, V> node) {
        if (node != null) {
            node.color = RED;
        }
    }

    /**
     * 设置黑色
     *
     * @param node
     */
    public void setBlack(RBNode<K, V> node) {
        if (node != null) {
            node.color = BLACK;
        }
    }

    /**
     * 中序打印二叉树
     */
    public void midInorderPrint() {
        midInorderPrint(this.rootNode);
    }

    public void midInorderPrint(RBNode<K, V> node) {
        if (node != null) {
            midInorderPrint(node.leftChild);
            System.out.println("key:" + node.key + ",value:" + node.value);
            midInorderPrint(node.rightChild);
        }
    }

    /**
     * 左旋x节点
     * 示意图：
     *     P                        p
     *     |                        |
     *     x                        y
     *    / \       -------->      / \
     *  lx   y                   x   ry
     *      / \                 / \
     *     ly  ry             lx  ly
     * <p>
     * 1.将y的左子节点的父节点更新为x,并将x的右子节点指向y的左子节点
     * 2.当x的父节点不为空时，更新y的父节点为x的父节点，并将x的父节点指向y
     * 3.将x的父节点更新为y,将y的左子节点更新为x
     *
     * @param <K>
     * @param <V>
     */
    public void leftRonate(RBNode<K, V> x) {
        RBNode y = x.rightChild;
        //将x的右子节点指向y的左子节点,并将y的左子节点的父节点更新为x
        x.rightChild = y.leftChild;
        if (y.leftChild != null) {
            y.leftChild.parent = x;
        }
        //当x的父节点不为空时，更新y的父节点为x的父节点，并将x的父节点的子树指向y
        if (x.parent != null) {
            y.parent = x.parent;
            if (x == x.parent.leftChild) {
                x.parent.leftChild = y;
            } else {
                x.parent.rightChild = y;
            }
        } else {
            //x为跟节点的情况
            this.rootNode = y;
            this.rootNode.parent = null;
        }
        //将x的父节点更新为y,将y的左子节点更新为x
        x.parent = y;
        y.leftChild = x;
    }

    /**
     * 右旋y节点
     * 示意图：
     *     P                        p
     *     |                        |
     *     y                        x
     *    / \       -------->      / \
     *   x  ry                    lx  y
     *  / \                          / \
     * lx ly                        ly  ry
     * <p>
     * 1.将y的左子节点指向x的右子节点，并且更新x的右子节点的父节点为y
     * 2.当y的父节点不为空时，更新x的父节点为y的父节点，更新y的父节点的子树为x
     * 3.更新y的父节点为x,更新x的右子节点为y
     *
     * @param <K>
     * @param <V>
     */
    public void rightRonate(RBNode<K, V> y) {
        RBNode x = y.leftChild;
        //将y的左子节点指向x的右子节点，并且更新x的右子节点的父节点为y
        y.leftChild = x.rightChild;
        if (x.rightChild != null) {
            x.rightChild.parent = y;
        }
        //当y的父节点不为空时，更新x的父节点为y的父节点，更新y的父节点的子树为x
        if (y.parent != null) {
            x.parent = y.parent;
            if (y == y.parent.leftChild) {
                y.parent.leftChild = x;
            } else {
                y.parent.rightChild = x;
            }
        } else {
            this.rootNode = x;
            this.rootNode.parent = null;
        }
        //更新y的父节点为x,更新x的右子节点为y
        y.parent = x;
        x.rightChild = y;
    }

    /**
     * 公开的插入方法
     *
     * @param <K>
     * @param <V>
     */
    public void insert(K key, V value) {
        RBNode<K, V> node = new RBNode<>();
        node.key=key;
        node.value=value;
        node.color=RED;
        insert(node);
    }

    private void insert(RBNode<K, V> node) {
        //查找当前node的父节点
        RBNode<K, V> parent = null;
        RBNode<K, V> x = this.rootNode;
        while (x != null) {
            parent = x;
            int cmp = node.key.compareTo(x.key);
            if (cmp > 0) {
                x = x.rightChild;
            } else if (cmp < 0) {
                x = x.leftChild;
            } else {
                x.value= node.value;
                return;
            }
        }
        node.parent = parent;
        if (parent != null) {
            int cmp = node.key.compareTo(parent.key);
            if (cmp > 0) {
                parent.rightChild = node;
            } else {
                parent.leftChild = node;
            }
        }else {
            this.rootNode = node;
        }
        insertFixup(node);
    }
    /**
     * 修复红黑树平衡
     *  1.红黑树为空树，将根节点染色为黑色,只需要染色操作
     *  2.插入节点的key值已存在，重新赋值即可
     *  3.插入节点的父节点为黑色，无需操作
     *  需要自己处理
     *  4.插入节点的父节点为红色
     *      4.1.叔叔节点存在并且为红色，叔父双红。将父节点和叔叔节点染色成黑色，爷爷节点染色成红色，然后以爷爷节点为当前节点进行下一轮处理。
     *      4.2.叔叔节点不存在，或者为黑色，父节点为爷爷节点的左子节点
     *          4.2.1.插入节点为其父节点的左子树（LL）。将父节点染色为黑色，将爷爷节点染色为红色，然后以爷爷节点右旋。
     *          4.2.2.插入节点为其父节点的右子树(LR)。以父节点为旋转节点进行一次左旋，然后得到4.2.1(LL)的情景。再以父节点为当前节点进行下一轮处理。
     *      4.3.叔叔节点不存在，或者为黑色，父节点为爷爷节点的右子节点
     *          4.3.1.插入节点为父节点的右子节点(RR)。将父节点染色为黑色，将爷爷节点染色为红色，然后以爷爷节点进行左旋。
     *          4.3.2.插入节点为父节点的左子节点(RL)。以父节点进行右旋，得到4.3.1(RR)的情景，然后以父节点为当前节点进行下一轮处理。
     * @param node
     */
    private void insertFixup(RBNode<K, V> node){
        this.rootNode.color=BLACK;
        RBNode<K, V> parent = parentOf(node);
        RBNode<K, V> gparent = parentOf(parent);
        RBNode<K, V> uncle= null;
        //情景4:插入节点的父节点为红色
        if(parent!=null && isRed(parent)){
            if (parent == gparent.leftChild){//父节点为爷爷节点的左子节点
                uncle=gparent.rightChild;
                // 情景4.1：叔父双红
                if (uncle!=null&& isRed(uncle)){
                    setBlack(parent);
                    setBlack(uncle);
                    setRed(gparent);
                    insertFixup(gparent);
                    return;
                }
                //情景4.2 叔叔节点不存在，或者为黑色
                if (uncle == null || isBlack(uncle)){
                    //4.2.1.插入节点为其父节点的左子树（LL）
                    //将父节点染色为黑色，将爷爷节点染色为红色，然后以爷爷节点右旋。
                    if (node==parent.leftChild){
                        setBlack(parent);
                        setRed(gparent);
                        rightRonate(gparent);
                        return;
                    }
                    if (node==parent.rightChild){
                        leftRonate(parent);
                        insertFixup(parent);
                        return;
                    }
                }

            }else {//父节点为爷爷节点的右子节点
                uncle=gparent.leftChild;
                // 情景4.1：叔父双红
                if (uncle!=null&& isRed(uncle)){
                    setBlack(parent);
                    setBlack(uncle);
                    setRed(gparent);
                    insertFixup(gparent);
                    return;
                }
                //4.3 叔叔节点不存在，或者为黑色，父节点为爷爷节点的右子节点
                if (uncle==null|| isBlack(uncle)){
                    //4.3.1.插入节点为父节点的右子节点
                    //将父节点染色为黑色，将爷爷节点染色为红色，然后以爷爷节点进行左旋。
                    if (node==parent.rightChild){
                        setBlack(parent);
                        setRed(gparent);
                        leftRonate(gparent);
                        return;
                    }
                    //4.3.2.插入节点为父节点的左子节点(RL)
                    //以父节点进行右旋，得到4.3.1(RR)的情景，然后以父节点为当前节点进行下一轮处理。
                    if (node==parent.leftChild){
                        rightRonate(parent);
                        insertFixup(parent);
                        return;
                    }
                }

            }
        }
    }

    public class RBNode<K extends Comparable<K>, V> {
        private boolean color;
        private int subTree;
        private K key;
        private V value;
        private RBNode<K, V> parent;
        private RBNode leftChild;
        private RBNode rightChild;

        public RBNode() {
        }

        public RBNode(boolean color, int subTree, K key, V value, RBNode<K, V> parent, RBNode leftChild, RBNode rightChild) {
            this.color = color;
            this.subTree = subTree;
            this.key = key;
            this.value = value;
            this.parent = parent;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
        }
    }
}
