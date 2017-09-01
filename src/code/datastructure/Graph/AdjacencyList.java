package code.datastructure.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//AdjacencyList representation of the graph 
public class AdjacencyList {

    private Map<Integer, ArrayList<Integer>> graph = new HashMap<Integer, ArrayList<Integer>>();
    private int numOfVertices;

    public AdjacencyList(int numOfVertices) {
        this.numOfVertices = numOfVertices;
    }

    public void addEdge(Integer vertexOne, Integer vertexTwo) {
        if (graph.get(vertexOne) != null) {
            graph.get(vertexOne).add(vertexTwo);
        } else {
            ArrayList<Integer> edgeList = new ArrayList<Integer>();
            edgeList.add(vertexTwo);
            graph.put(vertexOne, edgeList);
        }
    }

    public void removeEdge(Integer vertexOne, Integer vertexTwo) {
        if (graph.get(vertexOne) != null) {
            graph.get(vertexOne).remove(vertexTwo);
        } else {
            System.out.println("Edge cannot be removed. Vertex contains no edge!!");
        }
    }

    public int getNumOfVertices() {
        return this.numOfVertices;
    }

    public boolean hasEdge(int vertexOne, int vertexTwo) {
        boolean hasEdge = false;
        if (graph.get(vertexOne) != null) {
            ArrayList<Integer> edgeList = graph.get(vertexOne);
            hasEdge = (edgeList.contains(vertexTwo)) ? true : false;
        } else {
            System.out.println("Vertex contains no edges");
        }
        return hasEdge;
    }

    public List<Integer> adjacentNodes(int vertex) {
        if (graph.get(vertex) != null) {
            return graph.get(vertex);
        } else {
            return new ArrayList<Integer>();
        }
    }

    public List<Integer> outEdges(int vertex) {
        return this.adjacentNodes(vertex);
    }

    public List<Integer> inEdges(int vertex) {
        List<Integer> inEdgesList = new ArrayList<Integer>();
        for (Map.Entry<Integer, ArrayList<Integer>> tmpGraph : graph.entrySet()) {
            if (tmpGraph.getValue().contains(vertex)) {
                inEdgesList.add(tmpGraph.getKey());
            }
        }
        return inEdgesList;
    }

    public void printGraph() {
        for (Map.Entry<Integer, ArrayList<Integer>> tmpGraph : graph.entrySet()) {
            System.out.println("vertex: " + tmpGraph.getKey() + " Edges: " + tmpGraph.getValue());
        }
    }

    public static void main(String[] args) {
        AdjacencyList adL = new AdjacencyList(7);

        adL.addEdge(0, 3);
        adL.addEdge(1, 2);
        adL.addEdge(2, 0);
        adL.addEdge(3, 4);
        adL.addEdge(5, 4);
        adL.addEdge(6, 4);
        adL.addEdge(6, 5);

        adL.printGraph();

        System.out.println(adL.inEdges(4));
        System.out.println(adL.outEdges(4));
        System.out.println(adL.adjacentNodes(6));
        System.out.println(adL.hasEdge(4, 6));
        System.out.println(adL.hasEdge(0, 3));
        System.out.println(adL.getNumOfVertices());
        System.out.println(adL.inEdges(2));
        System.out.println(adL.hasEdge(6, 4));
        adL.removeEdge(6, 4);
        System.out.println(adL.hasEdge(6, 4));

    }

}
