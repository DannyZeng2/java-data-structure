package tree.node;

import javax.swing.*;

public class ThreadedTreeNode {

    private int value;

    private ThreadedTreeNode leftChild;

    private ThreadedTreeNode rightChild;

    // 标识指针类型 0:指向子树；1：指向前一个节点
    private int leftType;

    private int rightType;

    public ThreadedTreeNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ThreadedTreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(ThreadedTreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public ThreadedTreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(ThreadedTreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public int getLeftType() {
        return leftType;
    }

    public void setLeftType(int leftType) {
        this.leftType = leftType;
    }

    public int getRightType() {
        return rightType;
    }

    public void setRightType(int rightType) {
        this.rightType = rightType;
    }

    // 前序遍历 Preorder Traversal (VLR)
    public void vlrPrint() {
        System.out.println(value);
        if (leftChild != null) {
            leftChild.vlrPrint();
        }
        if (rightChild != null) {
            rightChild.vlrPrint();
        }
    }

    // 中序遍历 Inorder Traversal (LDR)
    public void ldrPrint() {
        if (leftChild != null) {
            leftChild.ldrPrint();
        }
        System.out.println(value);
        if (rightChild != null) {
            rightChild.ldrPrint();
        }
    }

    // 后序遍历 Postorder Traversal (LRD)
    public void lrdPrint() {
        if (leftChild != null) {
            leftChild.lrdPrint();
        }
        if (rightChild != null) {
            rightChild.lrdPrint();
        }
        System.out.println(value);
    }

    public ThreadedTreeNode vlrSearch(int val) {
        ThreadedTreeNode target = null;
        if (this.value == val) {
            return this;
        }
        if (leftChild != null) {
            target = leftChild.vlrSearch(val);
        }
        if (target != null) {
            return target;
        }
        if (rightChild != null) {
            target = rightChild.vlrSearch(val);
        }
        if (target != null) {
            return target;
        }
        return target;
    }
}
