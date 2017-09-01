package code.datastructure.Graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

//Non recursive Depth First Search implementation 
public class DFSBFS {

    private Map<Integer, ArrayList<Integer>> graph = new HashMap<Integer, ArrayList<Integer>>();
    private int numOfVertices;

    public DFSBFS(int numOfVertices) {
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

    public Integer getUnvisitedNode(int vertex, Set<Integer> visitedNodes) {
        List<Integer> adjacentNodes = this.adjacentNodes(vertex);
        Integer unvisitedNode = null;
        for (int i = 0; i < adjacentNodes.size(); i++) {
            int tmpNode = adjacentNodes.get(i);
            if (!visitedNodes.contains(tmpNode)) {
                unvisitedNode = tmpNode;
                break;
            }
        }
        return unvisitedNode;
    }

    public boolean dfs(int startNode, int numberToBeFound) {
        boolean found = false;
        Stack<Integer> stack = new Stack<Integer>();
        Set<Integer> visitedNodes = new HashSet<Integer>();
        stack.push(startNode);

        while (!stack.isEmpty()) {
            int nextNode = stack.peek();
            found = (nextNode == numberToBeFound) ? true : false;
            if (found)
                break;
            visitedNodes.add(nextNode);
            System.out.println(stack);
            Integer unvisitedNode = this.getUnvisitedNode(nextNode, visitedNodes);

            if (unvisitedNode != null) {
                stack.push(unvisitedNode);
                visitedNodes.add(unvisitedNode);
                found = (unvisitedNode == numberToBeFound) ? true : false;
                if (found)
                    break;
            } else {
                stack.pop();
            }
        }
        return found;
    }

    public boolean bfs(int startNode, int numberToBeFound) {
        boolean found = false;
        Queue<Integer> queue = new LinkedList<Integer>();
        Set<Integer> visitedNodes = new HashSet<Integer>();
        queue.add(startNode);

        while (!queue.isEmpty()) {
            int nextNode = queue.peek();
            found = (nextNode == numberToBeFound) ? true : false;
            if (found)
                break;
            visitedNodes.add(nextNode);
            System.out.println(queue);
            Integer unvisitedNode = this.getUnvisitedNode(nextNode, visitedNodes);

            if (unvisitedNode != null) {
                queue.add(unvisitedNode);
                visitedNodes.add(unvisitedNode);
                found = (unvisitedNode == numberToBeFound) ? true : false;
                if (found)
                    break;
            } else {
                queue.poll();
            }
        }
        return found;
    }

    public void shortestPathBFS(int startNode, int numberToBeFound) {
        boolean shortestPathFound = false;
        Queue<Integer> queue = new LinkedList<Integer>();
        Set<Integer> visitedNodes = new HashSet<Integer>();
        Map<Integer, Integer> parentMap = new HashMap<Integer, Integer>();
        queue.add(startNode);

        while (!queue.isEmpty()) {
            int nextNode = queue.peek();
            shortestPathFound = (nextNode == numberToBeFound) ? true : false;
            if (shortestPathFound)
                break;
            visitedNodes.add(nextNode);
            System.out.println(queue);
            Integer unvisitedNode = this.getUnvisitedNode(nextNode, visitedNodes);

            if (unvisitedNode != null) {
                queue.add(unvisitedNode);
                visitedNodes.add(unvisitedNode);
                parentMap.put(unvisitedNode, nextNode);
                shortestPathFound = (unvisitedNode == numberToBeFound) ? true : false;
                if (shortestPathFound)
                    break;
            } else {
                queue.poll();
            }
        }
        this.printShortestPath(parentMap, startNode, numberToBeFound);
    }

    public void printShortestPath(Map<Integer, Integer> parentMap, int sourceNode, int goalNode) {
        List<Integer> shortestPath = new ArrayList<Integer>();
        int tmpNode = parentMap.get(goalNode);
        shortestPath.add(goalNode);
        shortestPath.add(tmpNode);
        while (tmpNode != sourceNode) {
            int tNode = parentMap.get(tmpNode);
            shortestPath.add(tNode);
            tmpNode = tNode;
        }
        Collections.reverse(shortestPath);
        System.out.println("Shortest path: " + shortestPath);
    }

    public static void main(String[] args) {

        // First we will construct the map
        DFSBFS dfs = new DFSBFS(9);
        dfs.addEdge(0, 1);
        dfs.addEdge(0, 3);
        dfs.addEdge(0, 8);
        dfs.addEdge(1, 0);
        dfs.addEdge(1, 7);
        dfs.addEdge(2, 3);
        dfs.addEdge(2, 5);
        dfs.addEdge(2, 7);
        dfs.addEdge(3, 0);
        dfs.addEdge(3, 2);
        dfs.addEdge(3, 4);
        dfs.addEdge(4, 3);
        dfs.addEdge(4, 8);
        dfs.addEdge(5, 2);
        dfs.addEdge(5, 6);
        dfs.addEdge(6, 5);
        dfs.addEdge(7, 1);
        dfs.addEdge(7, 2);
        dfs.addEdge(8, 0);
        dfs.addEdge(8, 4);

        dfs.printGraph();

        // Perform depth first search for node 6 starting at node 0
        // System.out.println("Node found in depth first search: " + dfs.dfs(0, 6));

        // Perform breadth first search for node 6 starting at node 0
        // System.out.println("Node found in depth first search: " + dfs.bfs(0, 6));

        dfs.shortestPathBFS(0, 6);
    }
}
