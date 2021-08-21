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

    private int getLeftHeight() {
        return left == null? 0:left.getHeight();
    }

    private int getRightHeight() {
        return right == null? 0:right.getHeight();
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
            if (this.right == null) {
                this.right = node;
            } else {
                this.right.add(node);
            }
        }


        if(getLeftHeight() - getRightHeight()>1) {
            if(left != null && left.getLeftHeight()<left.getRightHeight()) {
                left.leftRotate(); // 双旋转
                rightRotate();
            }else {
                rightRotate(); // 右旋转
            }
        }
        if(getRightHeight() - getLeftHeight()>1){
            if(right != null && right.getLeftHeight()>right.getRightHeight()) {
                left.rightRotate(); // 双旋转
                leftRotate();
            }else {
                leftRotate(); //左旋转
            }
        }
    }

    private void rightRotate() {
        SortTreeNode newRight = new SortTreeNode(data);
        newRight.right = right;
        newRight.left = left.right;
        data= left.data;
        left= left.left;
        right = newRight;
    }

    private void leftRotate() {
        SortTreeNode newLeft = new SortTreeNode(data);
        newLeft.left = left;
        newLeft.right = right.left;
        data= right.data;
        right= right.right;
        left = newLeft;
    }

    public int getHeight() {
        return Math.max(left == null ? 0 : left.getHeight(), right == null ? 0 : right.getHeight()) + 1;
    }

    // 中序遍历 Inorder Traversal (LDR)
    public void ldrPrint() {
        if (left != null) {
            left.ldrPrint();
        }
        System.out.print(data + " ");
        if (right != null) {
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
