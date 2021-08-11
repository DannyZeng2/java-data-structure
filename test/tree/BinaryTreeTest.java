package tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    @Test
    public void buildTree() {

        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);

        BinaryTree binaryTree = new BinaryTree();
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

        System.out.println(binaryTree.vlrSearch(3));
        System.out.println(binaryTree.vlrSearch(9));


    }
}