package Graph;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

class Pair {
    int row;
    int col;
    int time;

    Pair(int row, int col, int time) {
        this.row = row;
        this.col = col;
        this.time = time;
    }
}

public class RottenOranges {

    public static void main(String[] args) {
        // int[][] grid = { { 0, 1, 2 }, { 0, 1, 2 }, { 2, 1, 1 } };
        // int[][] grid = { { 0, 1, 2 }, { 0, 1, 2 }, { 2, 1, 1 } };
        int[][] grid = { { 0, 1, 2 }, { 0, 1, 1 }, { 2, 1, 1 } };
        // Output: 1
        // Explanation: The grid is-
        // 0 1 2
        // 0 1 2
        // 2 1 1
        // Oranges at positions (0,2), (1,2), (2,0)
        // will rot oranges at (0,1), (1,1), (2,2) and
        // (2,1) in unit time.

        Queue<Pair> q = new ArrayDeque<>();
        int visited[][] = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    q.add(new Pair(i, j, 0));
                    visited[i][j] = 2;
                }
            }
        }
        System.out.println("The maximum time required to rotten the Orange is : " + rottenOrangesBfs(grid, visited, q));
        System.out.println("Visited Array : ");
        for (int arr[] : visited) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("Grid Array : ");
        for (int arr[] : grid) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    public static int rottenOrangesBfs(int[][] grid, int[][] visited, Queue<Pair> q) {

        int delrow[] = { -1, 0, 1, 0 };
        int delcol[] = { 0, 1, 0, -1 };
        int maxTime = 0;

        // while q is not empty
        while (!q.isEmpty()) {

            Pair front = q.poll();
            int row = front.row;
            int col = front.col;
            int time = front.time;
            maxTime = Math.max(maxTime, time);
            System.out.println("Processing: (" + row + "," + col + ") at time " + time);

            // check in all four direction
            for (int i = 0; i < 4; i++) {
                int nrow = row + delrow[i];
                int ncol = col + delcol[i];

                // check bound
                if (nrow >= 0 && nrow < grid.length && ncol >= 0 && ncol < grid[0].length && grid[nrow][ncol] == 1
                        && visited[nrow][ncol] != 2) {
                    q.add(new Pair(nrow, ncol, time + 1));
                    visited[nrow][ncol] = 2;
                    System.out.println("Added: (" + nrow + "," + ncol + ") at time " + (time + 1));
                }
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && visited[i][j] != 2) {
                    System.out.println("Fresh orange found at: (" + i + "," + j + ")");
                    return -1;
                }
            }
        }

        return maxTime;
    }
}
