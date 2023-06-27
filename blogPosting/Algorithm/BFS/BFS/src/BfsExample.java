import java.util.*;
public class BfsExample {
    public String bfs(int[][] graph, int start){
        StringBuilder stringBuilder = new StringBuilder();
        int vertices = graph.length;
        boolean[] visited = new boolean[vertices];

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            stringBuilder.append(currentVertex).append(" ");

            for (int i = 0; i < vertices; i++) {
                if (graph[currentVertex][i] == 1 && !visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }

        return stringBuilder.toString();
    }
}
