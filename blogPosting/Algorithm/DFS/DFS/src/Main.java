public class Main {
    public static void main(String[] args) {
        // 그래프 생성
        Graph graph = new Graph();

        // 노드 생성
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        // 노드들 연결
        node1.addNeighbor(node2);
        node1.addNeighbor(node3);
        node2.addNeighbor(node4);
        node3.addNeighbor(node4);
        node4.addNeighbor(node5);

        // 그래프에 노드 추가
        graph.addNode(node1);
        graph.addNode(node2);
        graph.addNode(node3);
        graph.addNode(node4);
        graph.addNode(node5);

        // DFS 수행
        System.out.print("DFS: ");
        graph.dfs(node1);
    }
}