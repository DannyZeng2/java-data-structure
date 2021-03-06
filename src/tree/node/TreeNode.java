package tree.node;

public class TreeNode implements Comparable<TreeNode> {
    private int value;

    private TreeNode leftChild;

    private TreeNode rightChild;

    public TreeNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    // 前序遍历 Preorder Traversal (VLR)
    public void vlrPrint() {
        System.out.println(value);
        if( leftChild!= null) {
            leftChild.vlrPrint();
        }
        if( rightChild!= null) {
            rightChild.vlrPrint();
        }
    }

    // 中序遍历 Inorder Traversal (LDR)
    public void ldrPrint() {
        if( leftChild!= null) {
            leftChild.ldrPrint();
        }
        System.out.println(value);
        if( rightChild!= null) {
            rightChild.ldrPrint();
        }
    }

    // 后序遍历 Postorder Traversal (LRD)
    public void lrdPrint() {
        if( leftChild!= null) {
           leftChild.lrdPrint();
        }
        if( rightChild!= null) {
            rightChild.lrdPrint();
        }
        System.out.println(value);
    }

    public TreeNode vlrSearch(int val) {
        TreeNode target = null;
        if(this.value == val){
            return this;
        }
        if(leftChild != null) {
            target = leftChild.vlrSearch(val);
        }
        if(target != null) {
            return target;
        }
        if(rightChild != null) {
            target = rightChild.vlrSearch(val);
        }
        if(target != null) {
            return target;
        }
        return target;

    }

    @Override
    public int compareTo(TreeNode o) {
        return o.getValue() - this.getValue();
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "value=" + value +
                '}';
    }
}
