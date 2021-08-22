package graph;

import lombok.Data;
import stack.MyStack;

@Data
public class Graph {
    private Vertex[] vertexs;
    private int currentSize;
    private int[][] adjacencyMatrix;
    private MyStack stack = new MyStack();

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

    /**
     * 深度优先算法
     */
    public void dfs() {
        int currentIndex = 0;
        vertexs[0].setVisited(true);
        stack.push(0);
        System.out.println(vertexs[0].getValue());
        out:while (!stack.isEmpty()) {
            for(int i=currentIndex+1;i < vertexs.length;i++){
                if(adjacencyMatrix[currentIndex][i] == 1 && !vertexs[i].isVisited())  {
                    stack.push(i);
                    vertexs[i].setVisited(true);
                    System.out.println(vertexs[i].getValue());
                    continue out;
                }
            }
            //弹出栈顶元素
            stack.pop();
            //修改当前位置为栈顶元素的位置
            if(!stack.isEmpty()) {
                currentIndex=stack.peek();
            }
        }
    }
}
