public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(5); // 노드의 개수가 5인 무방향 그래프 생성

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        boolean[] visited = new boolean[5];
        graph.dfs(0,visited);
    }
}