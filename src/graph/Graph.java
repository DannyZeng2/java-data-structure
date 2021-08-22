package graph;

import lombok.Data;

@Data
public class Graph {
    private Vertex[] vertexs;
    private int currentSize;
    private int[][] adjacencyMatrix;

    public Graph(int size) {
        vertexs = new Vertex[size];
        adjacencyMatrix = new int[size][size];
    }

    public void addVertex(Vertex vertex) {
        vertexs[currentSize++] = vertex;
    }

    public void addEdge(String v1,String v2) {
        //找出两个顶点的下标
        int index1=0;
        for(int i=0;i<vertexs.length;i++) {
            if(vertexs[i].getValue().equals(v1)) {
                index1=i;
                break;
            }
        }
        int index2=0;
        for(int i=0;i<vertexs.length;i++) {
            if(vertexs[i].getValue().equals(v2)) {
                index2=i;
                break;
            }
        }
        adjacencyMatrix[index1][index2]=1;
        adjacencyMatrix[index2][index1]=1;
    }


}
