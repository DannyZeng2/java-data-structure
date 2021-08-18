package tree.node;

public class SortTreeNode {
    private int data;
    private SortTreeNode left;
    private SortTreeNode right;

    public SortTreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public SortTreeNode getLeft() {
        return left;
    }

    public void setLeft(SortTreeNode left) {
        this.left = left;
    }

    public SortTreeNode getRight() {
        return right;
    }

    public void setRight(SortTreeNode right) {
        this.right = right;
    }

    public void add(SortTreeNode node) {

        if(node == null) {
            return;
        }

        if(node.getData() < this.getData()) {
            if(this.left == null) {
                this.left = node;
            }else {
                this.left.add(node);
            }

        } else {
            if(this.right == null) {
                this.right = node;
            }else {
                this.right.add(node);
            }
        }

    }

    // 中序遍历 Inorder Traversal (LDR)
    public void ldrPrint() {
        if( left!= null) {
            left.ldrPrint();
        }
        System.out.println(data);
        if( right!= null) {
            right.ldrPrint();
        }
    }
}
