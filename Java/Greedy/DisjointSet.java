package Greedy;

import java.util.Arrays;

/* Implement Disjoint Set DataStructure */
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

public class DisjointSet {

    public static void main(String[] args) {

        int n = 5;
        Disjoint ds = new Disjoint(n);

        // Initially, each element is in its own set
        System.out.println("Initial sets:");
        for (int i = 0; i < n; i++) {
            System.out.println("Parent of " + i + " is " + ds.findParent(i));
        }

        // Merge some sets
        ds.merge(0, 2);
        ds.merge(1, 3);
        ds.merge(0, 4);

        System.out.println("\nAfter merging (0,2), (1,3), and (0,4):");
        // (0,2) pu=0, pv=2, r1=0,r2=0, parent[0] = 2, rank[2] = 1
        // (1,3) pu=1, pv=3, r1=0,r2=0, parent[1] = 3, rank[3] = 1
        // (0,4) pu=2, pv=4, r1=1,r2=0, r1>r2, parent[pv] = pu i.e parent[4] = 2,
        for (int i = 0; i < n; i++) {
            System.out.println("Parent of " + i + " is " + ds.findParent(i));
        }
        System.out.println("Ranks : " + Arrays.toString(ds.rank));

        // Check if elements are in the same set
        System.out.println("\nChecking if elements are in the same set:");
        System.out.println("Are 0 and 2 in the same set? " + (ds.findParent(0) == ds.findParent(2))); // yes
        System.out.println("Are 1 and 3 in the same set? " + (ds.findParent(1) == ds.findParent(3))); // yes
        System.out.println("Are 0 and 4 in the same set? " + (ds.findParent(0) == ds.findParent(4))); // yes
        System.out.println("Are 1 and 4 in the same set? " + (ds.findParent(1) == ds.findParent(4))); // no

        // Merge the remaining sets
        // pu=2, pv=3 r1=1,r2=0 parent[2] = 3, rank[3] = 2
        ds.merge(2, 3);
        for (int i = 0; i < n; i++) {
            System.out.println("Parent of " + i + " is " + ds.findParent(i));
        }
        System.out.println("Ranks : " + Arrays.toString(ds.rank));

    }
}
