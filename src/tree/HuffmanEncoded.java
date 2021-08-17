package tree;

import tree.node.HuffmanEncodedNode;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HuffmanEncoded {

    private static StringBuilder sb = new StringBuilder();

    private static Map<Byte, String> huffCodeMaps = new HashMap<>();

    public static byte[] huffmanZipEncoded(String msg) {
        // 将每个字符转成字节码并创建节点
        List<HuffmanEncodedNode> nodes = buildNodes(msg);
        // 创建哈夫曼树
        HuffmanEncodedNode tree = createHuffmanTree(nodes);
        // 创建哈夫曼编码表
        Map<Byte, String> huffCodesTable = createHuffmanCodes(tree);
        // 编码表对字符串进行编码
        byte[] msgCode = encode(getBytesByString(msg), huffCodesTable);

        System.out.println("字符串转字节码数组：" + getBytesByString(msg));
        System.out.println("编码表：" + huffCodesTable);

        Byte[] decodeResult = decode(msgCode, huffCodesTable);


        System.out.print("decodeResult:");
        for (Byte aByte : decodeResult) {
            System.out.print(aByte+" ");
        }

        return msgCode;
    }

    public static Byte[] decode(byte[] bytes,Map<Byte,String> huffCodesTable) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            byte b = bytes[i];
            boolean isLastByte = (i==bytes.length-1);
            sb.append(byteToBitString(b,isLastByte));
        }
        Map<String,Byte> byteStringTable = new HashMap<>();

        huffCodesTable.forEach((k, v) -> {
            byteStringTable.put(v,k);
        });

        System.out.println("Byte-Char table:"+byteStringTable);

        System.out.println("Msg byte code:"+ sb);
        List<Byte> bytesResult = new ArrayList<>();
        for (int i = 0; i < sb.length();) {
            int count = 1;
            while (true) {
                String key = sb.substring(i, i+count);
                Byte character = byteStringTable.get(key);
                if(character == null) {
                    count++;
                }else {
                    bytesResult.add(byteStringTable.get(key));
                    break;
                }
            }
            i = i+count;
        }
        return bytesResult.toArray(new Byte[bytesResult.size()]);

    }

    public static String byteToBitString(byte b,boolean isLastByte) {
        int temp = b;
        if(!isLastByte) {
            temp|=256;
        }
        String s = Integer.toBinaryString(temp);
        return isLastByte?s :s.substring(s.length()-8);
    }


    private static byte[] encode(List<Byte> bytes, Map<Byte, String> huffCodes) {
        StringBuilder sb = new StringBuilder();
        bytes.forEach(v -> {
            sb.append(huffCodes.get(v));
        });
        int len;
        if(sb.length()%8 == 0) {
            len = sb.length()/8;
        }else{
            len = sb.length()/8 + 1;
        }
        byte[] byteArray = new byte[len];

        for (int i = 0, idx = 0; i < sb.length(); i+=8, idx++) {
            String byteStr;
            if(i+8>sb.length()) {
                byteStr = sb.substring(i);
            }else {
                byteStr = sb.substring(i,i+8);
            }
            byteArray[idx] = (byte) Integer.parseInt(byteStr,2);
        }
        return byteArray;
    }

    private static Map<Byte, String> createHuffmanCodes(HuffmanEncodedNode tree) {
        if (tree == null) {
            return null;
        }
        createHuffmanCodes(tree.getLeft(), "0", sb);
        createHuffmanCodes(tree.getRight(), "1", sb);
        return huffCodeMaps;
    }

    private static void createHuffmanCodes(HuffmanEncodedNode node, String code, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder(sb);
        sb2.append(code);
        if (node.getData() == null) {
            createHuffmanCodes(node.getLeft(), "0", sb2);
            createHuffmanCodes(node.getRight(), "1", sb2);
        } else {
            huffCodeMaps.put(node.getData(), sb2.toString());
        }
    }

    private static HuffmanEncodedNode createHuffmanTree(List<HuffmanEncodedNode> nodes) {
        while (nodes.size() > 1) {
            Collections.sort(nodes);
            HuffmanEncodedNode left = nodes.get(nodes.size() - 1);
            HuffmanEncodedNode right = nodes.get(nodes.size() - 2);
            HuffmanEncodedNode newNode = new HuffmanEncodedNode(null, left.getWeight() + right.getWeight());

            newNode.setLeft(left);
            newNode.setRight(right);

            nodes.remove(left);
            nodes.remove(right);

            nodes.add(newNode);
        }
        // System.out.println(nodes);
        return nodes.get(0);
    }

    private static List<HuffmanEncodedNode> buildNodes(String msg) {
        List<HuffmanEncodedNode> nodes = new ArrayList<>();

        List<Byte> list = getBytesByString(msg);
        // 统计元素出现的次数
        Map<Byte, Long> countMap = list.stream().collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting()));
        countMap.forEach((k, v) -> {
            nodes.add(new HuffmanEncodedNode(k, v));
        });
        return nodes;
    }

    private static List<Byte> getBytesByString(String msg) {
        byte[] bytes = msg.getBytes();
        List<Byte> list = new ArrayList<>();
        for (byte b : bytes) {
            list.add(b);
        }
        return list;
    }
}
