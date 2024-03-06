package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* ADJACENCY REPRESENTATION USING MAP */

/*
0 -> 1,2,3
1 -> 0,2
2 -> 0,1
3 -> 0
*/
public class AdjacencyListRepresentation {

    private Map<Integer, List<Integer>> adjacencyList;

    public AdjacencyListRepresentation() {
        this.adjacencyList = new HashMap<>();
    }

    // add edge
    public void addEdge(int source, int destination) {
        adjacencyList.computeIfAbsent(source, k -> new ArrayList<>()).add(destination);
        adjacencyList.computeIfAbsent(destination, k -> new ArrayList<>()).add(source);
    }

    // print the adjacency list
    public void printAdjacencyList() {
        for (Map.Entry<Integer, List<Integer>> entry : adjacencyList.entrySet()) {
            System.out.print(entry.getKey() + "--> ");
            for (int neighbours : entry.getValue()) {
                System.out.print(neighbours + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AdjacencyListRepresentation g = new AdjacencyListRepresentation();
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 2);

        g.printAdjacencyList();
    }
}
