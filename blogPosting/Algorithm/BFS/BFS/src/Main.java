public class Main {
    public static void main(String[] args) {
        int[][] graph = {
                {0, 1, 1, 0, 0, 0},
                {1, 0, 0, 1, 1, 0},
                {1, 0, 0, 0, 1, 0},
                {0, 1, 0, 0, 1, 1},
                {0, 1, 1, 1, 0, 1},
                {0, 0, 0, 1, 1, 0}
        };

        BfsExample bfsExample = new BfsExample();

        String result = bfsExample.bfs(graph, 0);
        System.out.println(result);
    }
}