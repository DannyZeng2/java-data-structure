package tree;

import tree.node.SortTreeNode;

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

    public SortTreeNode search(int value) {
        if (root == null) {
            throw new RuntimeException("empty tree!!!");
        }
        return root.search(value);
    }

    public void delete(int value) {
        if (root == null) {
            return;
        }

        SortTreeNode targetNode = search(value);
        // 如果被删除的节点树叶子节点
        if (targetNode.getLeft() == null && targetNode.getRight() == null) {
            deleteNodeWithNoChild(targetNode);
        } else if (targetNode.getRight() != null && targetNode.getLeft() != null) { // 如果被删除的节点有两个子节点
            deleteNodeWithTwoChild(targetNode);
        } else {  // 如果被删除的节点只有一个子节点
            deleteNodeWithOneChild(value, targetNode);
        }

    }

    private void deleteNodeWithTwoChild(SortTreeNode targetNode) {
        int minNodeValue = getMinNode(targetNode.getRight());

        targetNode.setData(minNodeValue);
    }

    private int getMinNode(SortTreeNode node) {
        SortTreeNode minNode = node;
        while (minNode.getLeft() != null) {
            minNode = minNode.getLeft();
        }
        delete(minNode.getData());
        return minNode.getData();
    }

    private void deleteNodeWithOneChild(int value, SortTreeNode targetNode) {
        SortTreeNode parentNode = getParentNode(targetNode);
        if (targetNode.getLeft() != null) {
            if (parentNode.getLeft().getData() == value) {
                parentNode.setLeft(targetNode.getLeft());
            } else {
                parentNode.setRight(targetNode.getLeft());
            }
        } else {
            if (parentNode.getLeft().getData() == value) {
                parentNode.setLeft(targetNode.getRight());
            } else {
                parentNode.setRight(targetNode.getRight());
            }
        }
    }

    private void deleteNodeWithNoChild(SortTreeNode targetNode) {
        SortTreeNode parentNode = getParentNode(targetNode);
        if (parentNode.getLeft() == targetNode) {
            parentNode.setLeft(null);
        } else {
            parentNode.setRight(null);
        }
    }

    public SortTreeNode getParentNode(SortTreeNode targetNode) {
        if (root == null) {
            throw new RuntimeException("empty tree!!");
        }
        if (targetNode == root) {
            throw new RuntimeException("this node is root node!!");
        }
        return root.getParentNode(targetNode);
    }
}
