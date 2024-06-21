package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Implement a Depth First Search in Java */
/*
 * 1. https://leetcode.com/problems/minimum-time-to-collect-all-apples-in-a-tree/description/
 * 
 */
public class DepthFirstSearch {

    public static void main(String[] args) {
        int V = 5;
        // Or, if you're using Java 9 or later, you can use the List.of() method
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(Arrays.asList(
                new ArrayList<>(List.of(2, 3, 1)),
                new ArrayList<>(List.of(0)),
                new ArrayList<>(List.of(0, 4)),
                new ArrayList<>(List.of(0)),
                new ArrayList<>(List.of(2))));

        System.out.println(adj);
        ArrayList<Integer> dfstraversal = new ArrayList<>();
        boolean[] visited = new boolean[V + 1];
        int start = 0;
        dfs(start, adj, visited, dfstraversal);
        System.out.println("Dfs Traversal is : " + dfstraversal);
    }

    public static void dfs(int start, ArrayList<ArrayList<Integer>> adjlist, boolean[] visited,
            ArrayList<Integer> dfstraversal) {

        // mark the current node as visited and add to the list
        visited[start] = true;
        dfstraversal.add(start);

        for (int neighbor : adjlist.get(start)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adjlist, visited, dfstraversal);
            }
        }
    }
}
