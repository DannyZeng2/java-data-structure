package tree;

import org.junit.Test;
import tree.node.TreeNode;

import static org.junit.Assert.*;

public class HuffmanTreeTest {

    @Test
    public void createHuffmanTree() {
        int[] arr = new int[]{3,7,8,29,5,11,23,14};
        TreeNode node = HuffmanTree.createHuffmanTree(arr);

        System.out.println("wdl:"+node.getValue());
        System.out.println("=== 中序遍历 ===");

        node.ldrPrint();
    }
}