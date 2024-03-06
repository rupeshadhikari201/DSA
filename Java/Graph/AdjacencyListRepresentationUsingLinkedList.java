package Graph;

import java.util.LinkedList;

/* ADJACENCY REPRESENTATION USING LINKED LIST */
/*
0 -> 1,2,3
1 -> 0,2
2 -> 0,1
3 -> 0
*/

public class AdjacencyListRepresentationUsingLinkedList {

    private int V;
    private LinkedList<Integer>[] adjacencyList; // Array of linked lists to represent adjacency lists

    // constructors
    AdjacencyListRepresentationUsingLinkedList(int v) {
        V = v;
        adjacencyList = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    // functions to add edge
    void addEdge(int v, int w) {
        adjacencyList[v].add(w); // add w to v's list
    }

    // Function to print the adjacency list representation of the graph
    void printAdjacencyList() {
        for (int i = 0; i < V; i++) {
            System.out.print("Vertex " + i + " is connected to : ");
            for (Integer elements : adjacencyList[i]) {
                System.out.print(elements + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AdjacencyListRepresentationUsingLinkedList g = new AdjacencyListRepresentationUsingLinkedList(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 0);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 1);
        g.addEdge(3, 0);

        g.printAdjacencyList();
    }
}
