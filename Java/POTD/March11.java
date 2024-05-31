package POTD;

import java.util.HashSet;
import java.util.Set;

public class March11 {

    public static void main(String[] args) {

        int mat1[][] = { { 1, 5, 6 },
                { 8, 10, 11 },
                { 15, 16, 18 } };

        int mat2[][] = { { 2, 4, 7 },
                { 9, 10, 12 },
                { 13, 16, 20 } };

        int collen = mat1[0].length;
        // System.out.println(collen);
        System.out.println(count2(mat1, mat2, 3, 21));
    }

    public static int count(int mat1[][], int mat2[][], int n, int x) {

        int count = 0;
        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                hs.add(mat2[i][j]);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (hs.contains(x - mat1[i][j])) {
                    count++;
                }
            }
        }

        return count;
    }

    public static int count2(int mat1[][], int mat2[][], int n, int target) {

        int row1 = 0;
        int row2 = n - 1;
        int col1 = 0;
        int col2 = n - 1;

        int count = 0;

        while (row1 < n && row2 > 0) {

            int sum = mat1[row1][col1] + mat2[row2][col2];
            if (sum == target) {
                count++;
                col1++;
                col2--;
            } else if (sum < target) {
                col1++;
            } else if (sum > target) {
                col2--;
            }

            if (col1 == n) {
                col1 = 0;
                row1++;
            }
            if (col2 == -1) {
                col2 = n - 1;
                row2--;
            }
        }

        return count;
    }
}
