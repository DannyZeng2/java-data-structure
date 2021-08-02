package linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class DoubleCircularNodeTest {

    @Test
    public void insertAfter() {
        DoubleCircularNode node1 = new DoubleCircularNode(1);
        DoubleCircularNode node2 = new DoubleCircularNode(2);
        DoubleCircularNode node3 = new DoubleCircularNode(3);
        DoubleCircularNode node4 = new DoubleCircularNode(4);

        node1.insertAfter(node2);
        node2.insertAfter(node3);
        node3.insertAfter(node4);

        System.out.println("node1 next:" + node1.getNextNode().getData());
        System.out.println("node2 next:" + node2.getNextNode().getData());
        System.out.println("node3 next:" + node3.getNextNode().getData());
        System.out.println("node4 next:" + node4.getNextNode().getData());
        System.out.println("-------------------");
        System.out.println("node1 prev:" + node1.getPrevNode().getData());
        System.out.println("node2 prev:" + node2.getPrevNode().getData());
        System.out.println("node3 prev:" + node3.getPrevNode().getData());
        System.out.println("node4 prev:" + node4.getPrevNode().getData());

    }
}