import java.util.ArrayList;
import java.util.List;

public class Graph {
    List<Node> nodes;

    public Graph() {
        this.nodes = new ArrayList<>();
    }

    public void addNode(Node node){
        this.nodes.add(node);
    }

    public void dfs(Node start){
        boolean[] visited = new boolean[nodes.size()+1]; // 0에서 부터 시작하기 때문에 요소 값에 맞춰 1증가
        dfsHelper(start, visited);
    }

    private void dfsHelper(Node node, boolean[] visited) {
        visited[node.value] = true;
        System.out.print(node.value + " ");

        for(Node neighbor : node.neighbors){
            if(!visited[neighbor.value]){
                dfsHelper(neighbor, visited);
            }
        }

    }
}
