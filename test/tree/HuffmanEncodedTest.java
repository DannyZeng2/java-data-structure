package tree;

import org.junit.Test;
import tree.node.HuffmanEncodedNode;

import static org.junit.Assert.*;

public class HuffmanEncodedTest {

    @Test
    public void huffmanZipEncoded() {
        String msg = "can you can a can as a can canner can a can.";
        String msgWithEncoded = HuffmanEncoded.huffmanZipEncoded(msg);
        System.out.println("编码结果：" + msgWithEncoded);
    }
}