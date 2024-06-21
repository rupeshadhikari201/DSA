package Graph;

import java.util.ArrayList;
import java.util.List;

/* Detect Cycle in a an undirected graph using UnionFind DataStructure */

/*   
The Disjoint Set data structure is indeed very useful for detecting cycles in an undirected graph. Here's how you can use it to find if there's a cycle in a graph:

1. Create a Disjoint Set with the number of vertices in the graph.
2. Iterate through all edges of the graph.
3. For each edge (u, v):
    3.1 Find the parent (set) of both u and v.
    3.2 If the parents are the same, there's a cycle.
    3.3 If the parents are different, union the sets.
 */
class Edge {
    int src;
    int dest;

    public Edge(int src, int dest) {
        this.src = src;
        this.dest = dest;
    }
}

class Disjoint {

    int[] parent;
    int[] rank;

    // n is the no of node in the graph
    public Disjoint(int n) {

        parent = new int[n];
        rank = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i; // initially, each node is parent of itself
            rank[i] = 0; // initially, rank of each node is 0;
        }
    }

    // function to find the ulitmate parent, using path-compression
    public int findParent(int x) {

        // check if the vertex x itself is a parent
        if (parent[x] == x)
            return parent[x];

        // else find the parent of x
        return parent[x] = findParent(parent[x]);
    }

    // funcion to merge(union) two vertex based on their rank
    public void merge(int u, int v) {

        // 1. find the ultimate parent of u and v
        int pu = findParent(u);
        int pv = findParent(v);

        // If the parents are the same, the nodes are already in the same set
        if (pu == pv)
            return;

        // 2. merge the node with smaller rank to the node with larger rank
        if (rank[pu] > rank[pv]) {
            parent[pv] = pu;
        } else if (rank[pu] < rank[pv]) {
            parent[pu] = pv;
        } else {
            // if r1=r2=0 (rank is same) merge any node with any and update the parent and
            // rank
            parent[pu] = pv;
            rank[pv]++;
        }
    }
}

public class DetectCycleUsingDisjointSet {
    public static void main(String[] args) {

        int V = 5; // no of vertex
        List<Edge> edges = new ArrayList<>();
        edges.add(new Edge(0, 1));
        edges.add(new Edge(1, 2));
        edges.add(new Edge(2, 3));
        edges.add(new Edge(3, 4));
        edges.add(new Edge(4, 1)); // This edge creates a cycle

        System.out.println(hasCycle(V, edges));

    }

    public static boolean hasCycle(int V, List<Edge> edges) {

        // 1. create a disjoint set for not of vertex in the graph
        Disjoint ds = new Disjoint(V);

        // 2. itterate over the edges(u,v) and do the following for each edge(u,v):
        for (Edge edge : edges) {

            // i. find the parent of (u,v)
            int srcparent = ds.findParent(edge.src);
            int destparent = ds.findParent(edge.dest);

            // ii. check if the parent of u and v is same, if yes there is a cycle
            if (srcparent == destparent) {
                return true;
            }

            // iii. else merge two edges
            ds.merge(srcparent, destparent);
        }

        return false;
    }

}
