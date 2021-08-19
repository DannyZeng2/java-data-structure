package tree.node;

public class HuffmanEncodedNode implements Comparable<HuffmanEncodedNode> {

    private Byte data;

    private long weight;

    private HuffmanEncodedNode left;

    private  HuffmanEncodedNode right;

    public HuffmanEncodedNode(Byte data, long weight) {
        this.data = data;
        this.weight = weight;
    }



    public Byte getData() {
        return data;
    }

    public void setData(Byte data) {
        this.data = data;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public HuffmanEncodedNode getLeft() {
        return left;
    }

    public void setLeft(HuffmanEncodedNode left) {
        this.left = left;
    }

    public HuffmanEncodedNode getRight() {
        return right;
    }

    public void setRight(HuffmanEncodedNode right) {
        this.right = right;
    }

    @Override
    public int compareTo(HuffmanEncodedNode o) {
        return (int) (o.weight - this.weight);
    }

    @Override
    public String toString() {
        return "HuffmanEncodedNode{" +
                "data=" + data +
                ", weight=" + weight +
                '}';
    }

    // 中序遍历 Inorder Traversal (LDR)
    public void ldrPrint() {
        if( left!= null) {
            left.ldrPrint();
        }
        System.out.println(data);
        if( right!= null) {
            right.ldrPrint();
        }
    }
}
