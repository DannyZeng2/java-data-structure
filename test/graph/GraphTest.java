package graph;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class GraphTest {

    @Test
    public void addVertex() {
        Vertex v1 = new Vertex("A");
        Vertex v2 = new Vertex("B");
        Vertex v3 = new Vertex("C");
        Vertex v4 = new Vertex("D");
        Vertex v5 = new Vertex("E");
        Graph graph = new Graph(5);

        graph.addVertex(v1);
        graph.addVertex(v2);
        graph.addVertex(v3);
        graph.addVertex(v4);
        graph.addVertex(v5);

        graph.addEdge("A", "C");
        graph.addEdge("B", "C");
        graph.addEdge("A", "B");
        graph.addEdge("B", "D");
        graph.addEdge("B", "E");

        for(int[] a:graph.getAdjacencyMatrix()) {
            System.out.println(Arrays.toString(a));
        }
    }
}