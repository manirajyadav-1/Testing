import java.util.Arrays;

public class Floyd_Warshall_Algo {
    static final int INF = 1000000000;

    public static void main(String[] args) {
        int[][] graph = {{0, 5, INF, 10},
                         {INF, 0, 3, INF},
                         {INF, INF, 0, 1},
                         {INF, INF, INF, 0}};

        int n = graph.length;
        int[][] dist = new int[n][n];

        // Initializing the 'dist' matrix with the same values as the 'graph' matrix
        for (int i = 0; i < n; i++) {
            dist[i] = Arrays.copyOf(graph[i], n);
        }

        // Floyd-Warshall algorithm
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        // Printing the result
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (dist[i][j] == INF) {
                    System.out.print("INF ");
                } else {
                    System.out.print(dist[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
