package Scaler.Array;

public class NearetPerfectSquare {

    public static void main(String[] args) {
        int N = 1500;
        // System.out.println(nearestPerfectSquare(N));
        int arr[] = nearestPerfectSquare(N);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] nearestPerfectSquare(int N) {
        // code here
        int ans[] = new int[2];

        int sqrt = (int) Math.sqrt(N);

        if (sqrt * sqrt == N) {
            ans[0] = N;
            ans[1] = 0;
        } else {
            int low = sqrt * sqrt;
            int high = (sqrt + 1) * (sqrt + 1);
            // System.out.println(low + " " + high + " \n");
            int min = Math.min(Math.abs(N - low), Math.abs(N - high));
            // System.out.println(min);
            if (Math.abs(N - low) > Math.abs(N - high)) {
                ans[0] = high;
                ans[1] = min;
            } else {
                ans[0] = low;
                ans[1] = min;
            }

        }

        return ans;

    }
}
