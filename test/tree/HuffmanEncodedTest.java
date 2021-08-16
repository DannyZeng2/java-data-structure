package tree;

import org.junit.Test;
import tree.node.HuffmanEncodedNode;

import static org.junit.Assert.*;

public class HuffmanEncodedTest {

    @Test
    public void huffmanZipEncoded() {
        String msg = "can you can a can as a can canner can a can.";
        byte[] msgWithEncoded = HuffmanEncoded.huffmanZipEncoded(msg);
        System.out.print("msgWithEncoded:");
        for (byte b : msgWithEncoded) {
            System.out.print(b+" ");
        }
    }

    @Test
    public void byteToBitString() {
        byte b =-1;
        //System.out.println(HuffmanEncoded.byteToBitString(b));
    }

}