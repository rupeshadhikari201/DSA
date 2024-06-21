package Graph;

import java.util.ArrayList;
import java.util.HashMap;

class Edge {
    int src;
    int dest;

    Edge(int src, int dest) {
        this.src = src;
        this.dest = dest;
    }
}

public class GraphRepresentation02 {
    public static void main(String[] args) {

        ArrayList<Edge> edges = new ArrayList<>();
        edges.add(new Edge(1, 2));
        edges.add(new Edge(1, 3));
        edges.add(new Edge(2, 5));
        edges.add(new Edge(2, 6));
        edges.add(new Edge(3, 4));
        edges.add(new Edge(3, 7));
        edges.add(new Edge(4, 8));
        edges.add(new Edge(7, 8));
        int V = 8;

        System.out.println("Adjacency List");
        System.out.println(AdjacencyList(V, edges));

        System.out.println("Adjacency Matix");
        printAdjacencyMatrix(createAdjacencyMatrix(V, edges));

    }

    public static HashMap<Integer, ArrayList<Integer>> AdjacencyList(int V, ArrayList<Edge> edges) {
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        for (int i = 1; i <= V; i++) {
            hm.put(i, new ArrayList<>());
        }
        for (Edge edge : edges) {
            hm.get(edge.src).add(edge.dest);
            hm.get(edge.dest).add(edge.src);
        }
        return hm;
    }

    public static int[][] createAdjacencyMatrix(int V, ArrayList<Edge> edges) {

        int adjMatrix[][] = new int[V + 1][V + 1];

        for (Edge edge : edges) {
            adjMatrix[edge.src][edge.dest] = 1;
            adjMatrix[edge.dest][edge.src] = 1; // for undirected graph
        }

        return adjMatrix;
    }

    public static void printAdjacencyMatrix(int[][] adjMatrix) {

        for (int i = 0; i < adjMatrix.length; i++) {
            for (int j = 0; j < adjMatrix[0].length; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*
     * This approach has several advantages:
     * 
     * 1. It's more memory-efficient as we don't need to store keys (which were
     * redundant in this case as they were just the indices).
     * 2. Access time is O(1) for getting the list of neighbors for any vertex.
     * 3. The code is somewhat simpler and more straightforward.
     * 
     * The main trade-off is that this approach assumes that vertex numbers are
     * continuous from 1 to V. If your graph might have large gaps in vertex
     * numbering (e.g., vertices numbered 1, 1000, 10000), then a HashMap might be
     * more appropriate.
     * 
     */
    public static ArrayList<ArrayList<Integer>> getAdjacencyList(int V, ArrayList<Edge> edges) {

        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();

        for (int i = 0; i <= V; i++) {
            arrayList.add(new ArrayList<>());
        }

        for (Edge edge : edges) {
            arrayList.get(edge.src).add(edge.dest);
            arrayList.get(edge.dest).add(edge.src); // for undirected graph
        }

        return arrayList;
    }
}
