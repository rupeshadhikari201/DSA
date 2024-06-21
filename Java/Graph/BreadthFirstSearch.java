package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    public static void main(String[] args) {

        int edges[][] = { { 0, 1 }, { 0, 2 }, { 1, 3 }, { 1, 4 }, { 2, 4 } };
        int no_of_node = 5;
        HashMap<Integer, ArrayList<Integer>> adjList = new HashMap<>();
        adjList = AdjacencyList(edges, no_of_node);
        System.out.println(adjList);
        BreadthFirst(0, adjList);

    }

    // Breadth First Search
    public static void BreadthFirst(int startNode, HashMap<Integer, ArrayList<Integer>> adjList) {

        boolean visited[] = new boolean[adjList.size()];
        Queue<Integer> q = new LinkedList<>();

        // add start node to the queue and mark it visited
        q.add(startNode);
        visited[startNode] = true;

        // while queue is not null
        while (!q.isEmpty()) {

            // get the front element and remove from queue
            int currentNode = q.poll();

            System.out.print(currentNode + " ");

            // itterate throught the neightbour of front and add to the queue
            ArrayList<Integer> neighbours = adjList.get(currentNode);
            for (int neightbour : neighbours) {
                // if the neighbour is not visited add
                if (!visited[neightbour]) {
                    q.add(neightbour);
                    visited[neightbour] = true;
                }
            }
        }
    }

    // Construct an Adjacency List
    public static HashMap<Integer, ArrayList<Integer>> AdjacencyList(int edges[][], int n) {

        HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();

        // for each node create an araylist to add it's neighbours
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }

        // add bidirectional edges to the nodes
        for (int edge[] : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        return graph;
    }

}
