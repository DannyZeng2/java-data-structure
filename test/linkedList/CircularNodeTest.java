package linkedList;

import org.junit.Test;

public class CircularNodeTest {

    @Test
    public void insertAfter() {
        CircularNode node1 = new CircularNode(1);
        CircularNode node2 = new CircularNode(2);
        CircularNode node3 = new CircularNode(3);
        CircularNode node4 = new CircularNode(4);

        node1.insertAfter(node2);
        node2.insertAfter(node3);
        node3.insertAfter(node4);

        System.out.println(node1.getNextNode().getData());
        System.out.println(node2.getNextNode().getData());
        System.out.println(node3.getNextNode().getData());
        System.out.println(node4.getNextNode().getData());
    }

    @Test
    public void show() {
        CircularNode node1 = new CircularNode(1);
        CircularNode node2 = new CircularNode(2);
        CircularNode node3 = new CircularNode(3);
        CircularNode node4 = new CircularNode(4);

        node1.insertAfter(node2);
        node2.insertAfter(node3);
        node3.insertAfter(node4);

        node2.show();
    }

    @Test
    public void deleteNext() {
        CircularNode node1 = new CircularNode(1);
        CircularNode node2 = new CircularNode(2);
        CircularNode node3 = new CircularNode(3);
        CircularNode node4 = new CircularNode(4);

        node1.insertAfter(node2);
        node2.insertAfter(node3);
        node3.insertAfter(node4);
        node1.deleteNext();

        node1.show();
    }
}