package POTD;

class March14 {

    public static void main(String[] args) {

        // prefix sum
        int n = 4;
        int[][] a = { { 'X', 'X', 'X', 'O' },
                { 'X', 'O', 'X', 'X' },
                { 'X', 'X', 'X', 'O' },
                { 'X', 'O', 'X', 'X' } };

        int h[][] = new int[n][n];
        int v[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                h[i][j] = (a[i][j] == 'X' ? (j == 0 ? 1 : h[i][j - 1] + 1) : 0);
                v[j][i] = (a[j][i] == 'X' ? (j == 0 ? 1 : v[j - 1][i] + 1) : 0);
            }
        }

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {

        // System.out.print(h[i][j] + " ");
        // }
        // System.out.println();
        // }
        // System.out.println();
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {

        // System.out.print(v[i][j] + " ");
        // }
        // System.out.println();
        // }
        int max = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {

                int size = Math.min(h[i][j], v[i][j]);
                while (size > max) {
                    if (h[i - size + 1][j] >= size && v[i][j - size + 1] >= size) {
                        max = size;
                        break;
                    } else {
                        size--;
                    }
                }
            }
        }
        System.out.println(max);

    }
}