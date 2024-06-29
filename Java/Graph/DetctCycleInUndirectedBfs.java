package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetctCycleInUndirectedBfs {
    public static void main(String[] args) {
        int edges[][] = { { 1, 2 }, { 2, 3 }, { 1, 3 } };
        int n = 3;
        int m = 3;
        System.out.println(cycleDetection(edges, n, m));
    }

    public static String cycleDetection(int[][] edges, int n, int m) {
        // Build an adjacency Matrix
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        System.out.println(adj);
        for (int edge[] : edges) {
            adj.get(edge[0] - 1).add(edge[1]);
            adj.get(edge[1] - 1).add(edge[0]);
        }

        System.out.print(adj);

        Queue<Integer> q = new LinkedList<>();
        int visited[] = new int[n];
        int parent[] = new int[n];

        return "fukcyou";
    }
}
