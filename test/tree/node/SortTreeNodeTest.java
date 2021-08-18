package tree.node;

import org.junit.Test;
import tree.BinarySortTree;

import static org.junit.Assert.*;

public class SortTreeNodeTest {

    @Test
    public void add() {

        BinarySortTree tree = new BinarySortTree();

        SortTreeNode node1 = new SortTreeNode(3);
        SortTreeNode node2 = new SortTreeNode(2);
        SortTreeNode node3 = new SortTreeNode(6);
        SortTreeNode node4 = new SortTreeNode(1);
        SortTreeNode node5 = new SortTreeNode(4);
        tree.add(node1);
        tree.add(node2);
        tree.add(node3);
        tree.add(node4);
        tree.add(node5);

        tree.ldrPrint();


    }
}