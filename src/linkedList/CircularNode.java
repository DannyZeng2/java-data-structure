package linkedList;

public class CircularNode {
    private int data;

    private CircularNode next = this;

    public CircularNode(int data) {
        this.data = data;
    }

    public CircularNode getNextNode() {
        return next;
    }

    public int getData() {
        return data;
    }

    public void insertAfter(CircularNode node) {
        CircularNode nextNode = this.next;
        this.next = node;
        node.next = nextNode;
    }

    public void show() {
        CircularNode currentNode = this;
        CircularNode headNode = this;

        while (true) {
            System.out.println(currentNode.getData());
            currentNode = currentNode.next;
            if (currentNode == headNode) {
                break;
            }
        }
    }

    public void deleteNext() {
        CircularNode newNext = next.next;
        this.next=newNext;
    }
}
