package tree;

import org.junit.Test;
import tree.node.SortTreeNode;

import static org.junit.Assert.*;

public class BinarySortTreeTest {

    @Test
    public void add() {
        BinarySortTree tree = new BinarySortTree();

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
        System.out.println("this data is found:" + node.getData());

        SortTreeNode parentNode = tree.getParentNode(node_1);
        System.out.println("parent:"+parentNode.getData());

        tree.delete(3);
        tree.ldrPrint();

    }



}