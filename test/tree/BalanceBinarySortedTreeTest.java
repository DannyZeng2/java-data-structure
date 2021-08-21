package tree;

import org.junit.Test;
import tree.node.SortTreeNode;

public class BalanceBinarySortedTreeTest {

    @Test
    public void test_delete() {
        BalanceBinarySortedTree tree = new BalanceBinarySortedTree();

        SortTreeNode node_3 = new SortTreeNode(3);
        SortTreeNode node_2 = new SortTreeNode(2);
        SortTreeNode node_6 = new SortTreeNode(6);
        SortTreeNode node_1 = new SortTreeNode(1);
        SortTreeNode node_4 = new SortTreeNode(4);
        tree.add(node_3);
        tree.add(node_2);
        tree.add(node_6);
        tree.add(node_1);
        tree.add(node_4);

        tree.ldrPrint();

        SortTreeNode node = tree.search(3);
        System.out.println("\nthis data is found:" + node.getData());

        SortTreeNode parentNode = tree.getParentNode(node_1);
        System.out.println("parent:"+parentNode.getData());

        tree.delete(3);
        tree.ldrPrint();

    }

    /**
     *         8
     *      6     9
     *    5   7
     *  4
     */
    @Test
    public void balance_tree_rightRotate(){
        BalanceBinarySortedTree tree = new BalanceBinarySortedTree();
        int[] nodeValues = new int[] {8,9,6,7,5,4};
        for (int nodeValue : nodeValues) {
            SortTreeNode node = new SortTreeNode(nodeValue);
            tree.add(node);
        }
        System.out.println("tree height:" + tree.getHeight());
        System.out.println("root value: " + tree.getRoot().getData());
        tree.ldrPrint();
    }

    /**
     *     2
     *  1     4
     *      3    5
     *              6
     */
    @Test
    public void balance_tree_leftRotate(){
        BalanceBinarySortedTree tree = new BalanceBinarySortedTree();
        int[] nodeValues = new int[] {2,1,4,3,5,6};
        for (int nodeValue : nodeValues) {
            SortTreeNode node = new SortTreeNode(nodeValue);
            tree.add(node);
        }
        System.out.println("tree height:" + tree.getHeight());
        System.out.println("root value: " + tree.getRoot().getData());
        tree.ldrPrint();
    }

    /**
     *       8
     *    5     9
     *  4   6
     *        7
     */
    @Test
    public void balance_tree_double_Rotate(){
        BalanceBinarySortedTree tree = new BalanceBinarySortedTree();
        int[] nodeValues = new int[] {8,9,5,4,6,7};
        for (int nodeValue : nodeValues) {
            SortTreeNode node = new SortTreeNode(nodeValue);
            tree.add(node);
        }
        System.out.println("tree height:" + tree.getHeight());
        System.out.println("root value: " + tree.getRoot().getData());
        tree.ldrPrint();
    }
}