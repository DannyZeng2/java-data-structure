package tree;

import tree.node.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HuffmanTree {

    public static TreeNode createHuffmanTree(int[] arr) {

        List<TreeNode> treeNodes = new ArrayList<>();

        for (int value : arr) {
            treeNodes.add(new TreeNode(value));
        }

        Collections.sort(treeNodes);

        while(treeNodes.size()>1) {
            Collections.sort(treeNodes);
            TreeNode leftNode = treeNodes.get(0);
            TreeNode rightNode = treeNodes.get(1);

            TreeNode newNode = new TreeNode(leftNode.getValue() +rightNode.getValue());
            newNode.setLeftChild(leftNode);;
            newNode.setRightChild(rightNode);
            treeNodes.remove(leftNode);
            treeNodes.remove(rightNode);
            treeNodes.add(newNode);

        }

        return treeNodes.get(0);

    }


}
