import java.util.LinkedList;

public class Graph {
    public int v; // 노드의 개수
    private LinkedList<Integer>[] adj; // 인접리스트

    public Graph(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i<v;i++){
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int w){
        adj[v].add(w);
        adj[w].add(v);
    }

    public void dfs(int v, boolean[] visited){
        visited[v] = true;
        System.out.println(v+ " ");

        for (int n : adj[v]) {
            if (!visited[n]) {
                dfs(n, visited);
            }
        }
    }

}
