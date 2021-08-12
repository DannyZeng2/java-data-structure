package tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayBinaryTreeTest {

    @Test
    public void vlrPrint() {
        ArrayBinaryTree tree = new ArrayBinaryTree(new int[]{1,2,3,4,5,6,7});
        tree.vlrPrint(0);
    }
}