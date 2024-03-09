package String;

public class LCS {

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";
        int len = lcs(s1, s2);
        int start = 0;
        char res[] = new char[len];
        // System.out.println(lcs(s1, s2));

        // System.out.println(res[0] = s2.charAt(0));
    }

    public static int lcs(String s1, String s2) {

        int n = s1.length();
        int m = s2.length();
        char res[] = new char[10];
        int start = 0;
        int dp[][] = new int[n + 1][m + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {

                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    res[start] = s1.charAt(i);
                    start++;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        for (char i : res) {
            System.out.println(i + " ");
        }
        return dp[n][m];
    }

}
