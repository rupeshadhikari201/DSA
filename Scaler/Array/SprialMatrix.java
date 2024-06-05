package Scaler.Array;

public class SprialMatrix {

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        spiralMat(arr);
    }

    public static void spiralMat(int arr[][]) {

        int cmin = 0;
        int rmin = 0;
        int cmax = arr[0].length - 1;
        int rmax = arr.length - 1;
        int n = arr.length;
        int m = arr[0].length;
        int count = 0;

        while (count <= n * m) {

            // top
            for (int col = cmin; col <= cmax && count <= n * m; col++) {
                System.out.print(arr[rmin][col] + " ");
                count++;
            }
            rmin++;

            // left
            for (int row = rmin; row <= rmax && count <= n * m; row++) {
                System.out.print(arr[row][cmax] + " ");
                count++;
            }
            cmax--;

            // bottom
            for (int col = cmax; col >= cmin && count <= n * m; col--) {
                System.out.print(arr[rmax][col] + " ");
                count++;
            }
            rmax--;

            // right
            for (int row = rmax; row >= rmin && count <= n * m; row--) {
                System.out.print(arr[row][cmin] + " ");
                count++;
            }
            cmin++;
        }
    }
}
