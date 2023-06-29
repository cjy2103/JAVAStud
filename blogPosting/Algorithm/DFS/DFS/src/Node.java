import java.util.ArrayList;
import java.util.List;

public class Node {
    int value;
    List<Node> neighbors;

    public Node(int value) {
        this.value = value;
        this.neighbors = new ArrayList<>();
    }

    public void addNeighbor(Node neighbor){
        this.neighbors.add(neighbor);
    }
}
