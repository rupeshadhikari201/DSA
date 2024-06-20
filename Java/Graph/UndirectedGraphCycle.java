package Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/*Given an undirected graph with V vertices labelled from 0 to V-1 and E edges, check whether it contains any cycle or not. Graph is in the form of adjacency list where adj[i] contains all the nodes ith node is having edge with. */

public class UndirectedGraphCycle {

    public static void main(String[] args) {

        int V = 5;
        int E = 5;
        int[][] adj = { { 1 }, { 0, 2, 4 }, { 1, 3 }, { 2, 4 }, { 1, 3 } };
        ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1)),
                new ArrayList<>(Arrays.asList(0, 2, 4)),
                new ArrayList<>(Arrays.asList(1, 3)),
                new ArrayList<>(Arrays.asList(2, 4)),
                new ArrayList<>(Arrays.asList(1, 3))));

        // Print the list of lists in a single line
        adjacencyList.forEach(System.out::println);
        System.out.println(adjacencyList.get(1).size());
        System.out.println(adjacencyList.get(1));
        // Output: 1

        System.out.println(BfsDetectCycle(adj, V));
        System.out.println(DetectCycle(adjacencyList, V));
    }

    public static boolean BfsDetectCycle(int adjList[][], int V) {

        boolean ans = false;
        Queue<Integer> q = new ArrayDeque<>();
        int visited[] = new int[V];
        for (int i = 0; i < V; i++) {
            visited[i] = 0;
        }

        int startNode = 0;
        q.add(startNode);
        visited[startNode] = 1;

        while (!q.isEmpty()) {

            // remove and return the front element of the queue
            int currentNode = q.poll();

            // neighbours of currentNode
            int len = adjList[currentNode].length;
            int neighbours[] = new int[len];

            for (int i = 0; i < len; i++) {
                neighbours[i] = adjList[currentNode][i];
            }

            // itterate over the neighbouring nodes and check if they are visited or not, if
            // no add to the queue and mark visited
            for (int i = 0; i < len; i++) {
                if (visited[i] >= 1) {
                    ans = true;
                    break;
                } else {
                    q.add(neighbours[i]);
                    visited[i]++;
                }
            }
        }
        return ans;
    }

    // using ArrayList<ArrayList<Integer>> as an adjacency list
    public static boolean DetectCycle(ArrayList<ArrayList<Integer>> adj, int V) {

        boolean ans = false;
        Queue<Integer> q = new LinkedList<>();
        int visited[] = new int[V];

        for (int i = 0; i < V; i++) {
            visited[i] = 0;
        }

        int startNode = 0;
        q.add(startNode);
        visited[startNode] = 1;

        while (!q.isEmpty()) {

            int currentNode = q.poll();

            // check if the neighbours of currentNode is visited or not
            for (int neighbour : adj.get(currentNode)) {
                if (visited[neighbour] >= 0) {
                    ans = true;
                    break;
                } else {
                    q.add(neighbour);
                    visited[neighbour]++;
                }
            }
        }

        return ans;
    }

}
