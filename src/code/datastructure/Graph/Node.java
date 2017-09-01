package code.datastructure.Graph;

//This class represents each Node of the graph 
public class Node {

    private String id;
    private String name;

    public Node(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vertex [id=" + id + ", name=" + name + "]";
    }

}
