package Java.POTD;

// 06/16/2024
//https://chatgpt.com/share/780a1944-af6a-405e-905e-161698ab86f8

public class NumericKeyPad {

    public static void main(String[] args) {
        int n = 3;
        int ans = 0;
        int dp[][][] = new int[4][3][n + 1];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < n + 1; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }
        // System.out.println(Arrays.deepToString(dp));

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {

                // skip (3,0) and (3,2)
                if (i == 3 && (j == 0 || j == 2))
                    continue;

                ans += help(i, j, n, dp);
            }
        }
        System.out.println(ans);
    }

    public static int help(int i, int j, int n, int dp[][][]) {

        // overflow case
        if (i > 3 || j > 2 || i < 0 || j < 0)
            return 0;
        // # and * case
        if (i == 3 && (j == 0 || j == 2))
            return 0;
        if (n == 1)
            return 1;

        if (dp[i][j][n] != -1) {
            return dp[i][j][n];
        }
        n--;

        dp[i][j][n + 1] = help(i, j, n, dp) + help(i + 1, j, n, dp) + help(i - 1, j, n, dp) + help(i, j - 1, n, dp)
                + help(i, j + 1, n, dp);

        return dp[i][j][n + 1];
    }

}
