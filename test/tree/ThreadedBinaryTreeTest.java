package tree;

import org.junit.Test;
import tree.node.ThreadedTreeNode;

public class ThreadedBinaryTreeTest {

    @Test
    public void buildTree() {

        ThreadedTreeNode node1 = new ThreadedTreeNode(1);
        ThreadedTreeNode node2 = new ThreadedTreeNode(2);
        ThreadedTreeNode node3 = new ThreadedTreeNode(3);
        ThreadedTreeNode node4 = new ThreadedTreeNode(4);
        ThreadedTreeNode node5 = new ThreadedTreeNode(5);
        ThreadedTreeNode node6 = new ThreadedTreeNode(6);
        ThreadedTreeNode node7 = new ThreadedTreeNode(7);

        ThreadedBinaryTree binaryTree = new ThreadedBinaryTree();
        binaryTree.setRoot(node1);
        node1.setLeftChild(node2);
        node1.setRightChild(node3);

        node2.setLeftChild(node4);
        node2.setRightChild(node5);

        node3.setLeftChild(node6);
        node3.setRightChild(node7);

        System.out.println("=== 前序遍历 ===");
        binaryTree.vlrPrint();

        System.out.println("=== 中序遍历 ===");
        binaryTree.ldrPrint();

        System.out.println("=== 后序遍历 ===");
        binaryTree.lrdPrint();

        binaryTree.threadedNode();
       //ThreadedTreeNode node = binaryTree.vlrSearch(5);
        System.out.println("===========");

        System.out.println(node5.getLeftChild().getValue());
        System.out.println(node5.getRightChild().getValue());
    }

}