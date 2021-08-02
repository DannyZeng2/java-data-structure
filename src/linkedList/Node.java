package linkedList;

public class Node {
    private int data;

    private Node next;

    public Node(int data) {
        this.data = data;
    }

    public Node getNextNode() {
        if(next == null) {
            throw new RuntimeException("此节点为最后一个节点");
        }
        return next;
    }

    public int getData() {
        return data;
    }

    public Node append(Node node) {
        Node currentNode = this;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = node;
        return this;
    }

    public Node pop() {
        Node currentNode = this;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    public void insertAfter(Node node) {
        Node nextNode = this.next;
        this.next = node;
        node.next = nextNode;
    }

    public void show() {
        Node currentNode = this;
        while (true) {
            if (currentNode == null) {
                break;
            }
            System.out.println(currentNode.getData());
            currentNode = currentNode.next;
        }
    }

    public void deleteNext(Node node) {
        Node newNext = next.next;
        this.next=newNext;
    }

    public boolean isTail() {
        return next==null;
    }

}
