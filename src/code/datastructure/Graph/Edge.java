package code.datastructure.Graph;

public class Edge {
    private String id;
    private Node sourceNode;
    private Node destinationNode;
    private int weight;

    public Edge(String id, Node sourceNode, Node destinationNode, int weight) {
        this.id = id;
        this.sourceNode = sourceNode;
        this.destinationNode = destinationNode;
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Node getSourceNode() {
        return sourceNode;
    }

    public void setSourceNode(Node sourceNode) {
        this.sourceNode = sourceNode;
    }

    public Node getDestinationNode() {
        return destinationNode;
    }

    public void setDestinationNode(Node destinationNode) {
        this.destinationNode = destinationNode;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Edge [id=" + id + ", sourceNode=" + sourceNode + ", destinationNode=" + destinationNode + ", weight=" + weight + "]";
    }
}