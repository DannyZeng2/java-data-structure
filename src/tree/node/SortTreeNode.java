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

    public SortTreeNode search(int value) {
        if(this.data == value) {
            return this;
        }

        if(this.data > value && this.left !=null) {
            return this.left.search(value);
        }if(this.data < value && this.right !=null) {
            return this.right.search(value);
        }else {
            throw new RuntimeException("data not found!!");
        }
    }

    public SortTreeNode getParentNode(SortTreeNode targetNode) {
        if(this.getLeft() == targetNode || this.getRight() == targetNode) {
            return this;
        }

        if(this.getData()>targetNode.getData() && this.getLeft() !=null) {
            return this.getLeft().getParentNode(targetNode);
        }else if(this.getData()<targetNode.getData() && this.getRight() !=null) {
            return this.getRight().getParentNode(targetNode);
        }
        return null;
    }
}
