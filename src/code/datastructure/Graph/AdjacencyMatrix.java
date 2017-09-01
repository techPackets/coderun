package code.datastructure.Graph;

import java.util.ArrayList;
import java.util.List;

/*Adjacency matrix implementation of graph*/
public class AdjacencyMatrix {

    private int[][] graph;
    private int numOfVertices;

    public AdjacencyMatrix(int numOfVertices) {
        this.numOfVertices = numOfVertices;
        this.graph = new int[numOfVertices][numOfVertices];
    }

    public void addEdge(int vertexOne, int vertexTwo) {
        graph[vertexOne][vertexTwo] = 1;
    }

    public void removeEdge(int vertexOne, int vertexTwo) {
        graph[vertexOne][vertexTwo] = 0;
    }

    public int getNumOfVertices() {
        return this.numOfVertices;
    }

    public boolean hasEdge(int vertexOne, int vertexTwo) {
        return (graph[vertexOne][vertexTwo] == 1) ? true : false;
    }

    public List<Integer> adjacentNodes(int vertex) {
        List<Integer> adjacentNodesList = new ArrayList<Integer>();
        for (int i = 0; i < getNumOfVertices(); i++) {
            if (graph[vertex][i] == 1) {
                adjacentNodesList.add(i);
            }
        }
        return adjacentNodesList;
    }

    public List<Integer> outEdges(int vertex) {
        return this.adjacentNodes(vertex);
    }

    public List<Integer> inEdges(int vertex) {
        List<Integer> inEdgesList = new ArrayList<Integer>();
        for (int i = 0; i < getNumOfVertices(); i++) {
            if (graph[i][vertex] == 1) {
                inEdgesList.add(i);
            }
        }
        return inEdgesList;
    }

    public void printAdjacencyMatrix() {
        for (int i = 0; i < getNumOfVertices(); i++) {
            for (int j = 0; j < getNumOfVertices(); j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AdjacencyMatrix adM = new AdjacencyMatrix(7);
        adM.addEdge(0, 3);
        adM.addEdge(1, 2);
        adM.addEdge(2, 0);
        adM.addEdge(3, 4);
        adM.addEdge(5, 4);
        adM.addEdge(6, 4);
        adM.addEdge(6, 5);

        adM.printAdjacencyMatrix();

        System.out.println(adM.inEdges(4));
        System.out.println(adM.outEdges(4));
        System.out.println(adM.adjacentNodes(6));
        System.out.println(adM.hasEdge(4, 6));
        System.out.println(adM.hasEdge(0, 3));
        System.out.println(adM.getNumOfVertices());
        System.out.println(adM.inEdges(2));
        System.out.println(adM.hasEdge(6, 4));
        adM.removeEdge(6, 4);
        System.out.println(adM.hasEdge(6, 4));

    }
}
