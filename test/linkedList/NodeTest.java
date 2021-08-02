package linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {

    @Test
    public void append() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.append(node2).append(node3).append(node4);

        node1.show();
    }

    @Test
    public void pop() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.append(node2).append(node3).append(node4);

        System.out.println(node1.pop().getData());
    }

    @Test
    public void insert() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.append(node2).append(node3);
        node2.insertAfter(node4);

        node1.show();

    }
}