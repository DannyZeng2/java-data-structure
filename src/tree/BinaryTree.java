package tree;

public class BinaryTree {

    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public void vlrPrint() {
       root.vlrPrint();
    }

    public void ldrPrint() {
        root.ldrPrint();
    }

    public void lrdPrint() {
        root.lrdPrint();
    }
}

