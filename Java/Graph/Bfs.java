package Java.Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Bfs {

    public static void main(String[] args) {

        int edges[][] = { { 1, 3 }, { 3, 5 }, { 2, 3 } };
        constructAdjacencyList(edges, 5);

    }

    // give edges, construct a Adjacency List
    public static void constructAdjacencyList(int edges[][], int n) {

        // use hashmp
        HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            graph.put(i, new ArrayList<>());
        }

        for (int edge[] : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        System.out.println(Arrays.asList(graph));
    }

}
