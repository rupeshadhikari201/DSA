package Graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

// https://www.geeksforgeeks.org/problems/find-the-number-of-islands/1
public class NoOfIsland {
    public static void main(String[] args) {

        int adjMatrix[][] = {
                { 0, 1, 1, 0 },
                { 0, 1, 1, 0 },
                { 0, 0, 1, 0 },
                { 0, 0, 0, 0 },
                { 1, 1, 0, 1 }
        };
        boolean visited[][] = new boolean[adjMatrix.length][adjMatrix[0].length];
        int count = 0;
        for (int i = 0; i < adjMatrix.length; i++) {
            for (int j = 0; j < adjMatrix[0].length; j++) {

                if (!visited[i][j] && adjMatrix[i][j] == 1) {
                    ArrayList<Integer> start = new ArrayList<>(List.of(i, j));
                    bfs(visited, adjMatrix, start);
                    count++;
                }
            }
        }
        System.out.println("The no.of Island is : " + count);
    }

    public static void bfs(boolean visited[][], int adjMatrix[][], ArrayList<Integer> start) {

        Queue<ArrayList> q = new ArrayDeque<>();

        // add the start cell to queue mark start as visited
        q.add(start);
        visited[start.get(0)][start.get(1)] = true;

        while (!q.isEmpty()) {

            ArrayList<Integer> currentCell = q.poll();
            int row = currentCell.get(0);
            int col = currentCell.get(1);

            // find the neighbours of the current cell in all eight directions
            for (int delrow = -1; delrow <= 1; delrow++) {
                for (int delcol = -1; delcol <= 1; delcol++) {

                    int nrow = row + delrow;
                    int ncol = col + delcol;

                    // check for outof bound for neighbour row and col
                    if (nrow >= 0 && nrow < adjMatrix.length && ncol >= 0 && ncol < adjMatrix[0].length) {
                        // if the neighbour is not visited and adjMatrix equals to 1 add to the queue
                        if (!visited[nrow][ncol] && adjMatrix[nrow][ncol] == 1) {
                            q.add(new ArrayList<>(List.of(nrow, ncol)));
                            visited[nrow][ncol] = true; // Mark as visited when adding to queue
                        }
                    }
                }
            }
        }

    }
}
