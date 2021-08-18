package tree;

import tree.node.SortTreeNode;
import tree.node.TreeNode;

public class BinarySortTree {

    private SortTreeNode root;



    public void add(SortTreeNode node) {
        if(this.root == null) {
            this.root = node;
            return;
        }
        this.root.add(node);
    }


    public void ldrPrint() {
        root.ldrPrint();
    }





}
