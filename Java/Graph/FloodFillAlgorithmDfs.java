package Graph;

import java.util.Arrays;

public class FloodFillAlgorithmDfs {

    public static void main(String[] args) {

        int[][] image = { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };
        int sr = 1;
        int sc = 1;
        int newColor = 2;
        // Output: {{2,2,2},{2,2,0},{2,0,1}}
        floodFill(image, sr, sc, newColor);

        System.out.println(Arrays.deepToString(image));
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int row = image.length;
        int col = image[0].length;
        boolean visited[][] = new boolean[row][col];
        int iniColor = image[sr][sc];

        int delrow[] = { -1, 0, 1, 0 };
        int delcol[] = { 0, 1, 0, -1 };
        dfs(image, sr, sc, newColor, visited, iniColor, delrow, delcol);

        return image;
    }

    public static void dfs(int[][] image, int sr, int sc, int newColor, boolean[][] visited, int iniColor, int delrow[],
            int delcol[]) {

        // change the value of (sr,sc) and mark it visited
        image[sr][sc] = newColor;
        visited[sr][sc] = true;

        int n = image.length;
        int m = image[0].length;

        // go all four direction and find the new row and column
        for (int i = 0; i < 4; i++) {
            int nrow = sr + delrow[i];
            int ncol = sc + delcol[i];

            // check if new row is in bound or not
            if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && image[nrow][ncol] == iniColor
                    && !visited[nrow][ncol]) {
                dfs(image, nrow, ncol, newColor, visited, iniColor, delrow, delcol);
            }
        }

    }

    // second Method
    public int[][] floodFill2(int[][] image, int sr, int sc, int newColor) {
        int iniColor = image[sr][sc];
        int n = image.length;
        int m = image[0].length;
        if (iniColor != newColor) {
            dfs(image, sr, sc, newColor, iniColor, n, m);
        }

        return image;
    }

    public void dfs(int[][] image, int sr, int sc, int newColor, int iniColor, int n, int m) {

        // check for bound
        if (sc < 0 || sc >= m || sr < 0 || sr >= n || image[sr][sc] != iniColor) {
            return;
        }

        // mark the current cell with new color
        image[sr][sc] = newColor;

        // call recursion for up,left, right, down
        dfs(image, sr - 1, sc, newColor, iniColor, n, m); // up
        dfs(image, sr, sc + 1, newColor, iniColor, n, m); // right
        dfs(image, sr + 1, sc, newColor, iniColor, n, m); // down
        dfs(image, sr, sc - 1, newColor, iniColor, n, m); // left
    }
}
