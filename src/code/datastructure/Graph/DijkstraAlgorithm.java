package code.datastructure.Graph;

//The class implements the Dijkstra's algorithm to find the shortest path between two nodes
//Not a priority Queue implementation 
public class DijkstraAlgorithm {

    public static void main(String[] args) {
        Graph graph = new Graph();

        Node A = new Node("A", "A");
        Node B = new Node("B", "B");
        Node C = new Node("C", "C");
        Node D = new Node("D", "D");
        Node E = new Node("E", "E");
        Node Z = new Node("Z", "Z");

        graph.addNode(A);
        graph.addNode(B);
        graph.addNode(C);
        graph.addNode(D);
        graph.addNode(E);
        graph.addNode(Z);

        /*Edge e1 = new Edge("1",A,B,4);Edge e2 = new Edge("2",B,A,4);
        Edge e2 = new Edge("2",A,C,2);
        Edge e3 = new Edge("3",B,C,2);
        Edge e2 = new Edge("2",A,C,2);
        Edge e2 = new Edge("2",A,C,2);
        Edge e2 = new Edge("2",A,C,2);
        Edge e2 = new Edge("2",A,C,2);
        Edge e2 = new Edge("2",A,C,2);
        Edge e2 = new Edge("2",A,C,2);
        Edge e2 = new Edge("2",A,C,2);*/

    }
}
