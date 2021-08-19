package tree;

import tree.node.ThreadedTreeNode;

public class ThreadedBinaryTree {

    private ThreadedTreeNode root;

    private ThreadedTreeNode prevNode = null;

    public ThreadedTreeNode getRoot() {
        return root;
    }

    public void setRoot(ThreadedTreeNode root) {
        this.root = root;
    }

    public void threadedPrint() {
        ThreadedTreeNode node = root;
        while (node !=null) {
            while(node.getLeftType() == 0) {
                node= node.getLeftChild();
            }
            System.out.println(node.getValue());

            while(node.getRightType() == 1) {
                node = node.getRightChild();
                System.out.println(node.getValue());
            }
            node = node.getRightChild();
        }
    }


    // 中序线索化二叉树
    public void threadedNode() {
        threadedNode(root);
    }

    public void threadedNode(ThreadedTreeNode node) {
        if(node == null) {
            return;
        }

        // 处理左子树
        threadedNode(node.getLeftChild());

        if(node.getLeftChild() == null) {
            node.setLeftChild(prevNode);
            node.setLeftType(1);
        }

        if (prevNode!=null &&prevNode.getRightChild() == null) {
            prevNode.setRightChild(node);
            prevNode.setRightType(1);
        }

        prevNode = node;

        // 处理右子树
        threadedNode(node.getRightChild());
    }

    public void vlrPrint() {
        root.vlrPrint();
    }

    public void ldrPrint() {
        root.ldrPrint();
    }

    public void lrdPrint() {
        root.lrdPrint();
    }

    public ThreadedTreeNode vlrSearch(int val) {
        return root.vlrSearch(val);
    }
}
