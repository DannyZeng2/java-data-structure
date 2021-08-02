package linkedList;

public class DoubleCircularNode {
    private int data;

    private DoubleCircularNode prev = this;

    private DoubleCircularNode next = this;

    public DoubleCircularNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public DoubleCircularNode getPrevNode() {
        return prev;
    }

    public DoubleCircularNode getNextNode() {
        return next;
    }

    public void insertAfter(DoubleCircularNode node) {
        DoubleCircularNode nextNext = this.next;
        this.next = node;
        node.prev = this;
        node.next = nextNext;
        nextNext.prev = node;
    }
}
