public class Main {
    public static void main(String[] args) {
        int v = 5; // 정점의 개수
        Graph graph = new Graph(v);

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(2,4);
        graph.addEdge(3,4);

        graph.printGraph();
    }
}
