package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* Given 2d array of edges construct a graph */
/* The code provided constructs an undirected graph. In an undirected graph, each edge is bidirectional, meaning if there's an edge from node A to node B, there's also an edge from node B to node A. 
 
If you want to modify the code to construct a directed graph, you need to only add the edge from the start node to the end node without adding the reverse edge.
    'For directed graph, do not add edge[1] -> edge[0]'

*/
public class GraphRepresentation {

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
