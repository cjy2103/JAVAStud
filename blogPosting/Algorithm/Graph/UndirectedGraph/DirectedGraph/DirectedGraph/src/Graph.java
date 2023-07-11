import java.util.ArrayList;
import java.util.List;

public class Graph {
    private int v; // 정점의 개수
    private List<List<Integer>> adjList; // 인접리스트

    public Graph(int v) {
        this.v = v;
        adjList = new ArrayList<>(v);
        for (int i = 0; i<v; i++){
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int dest){
        adjList.get(src).add(dest);
    }

    public void printGraph(){
        for (int i = 0; i < v; i++) {
            System.out.print("정점 " + i + "에 인접한 정점: ");
            for (int j : adjList.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
