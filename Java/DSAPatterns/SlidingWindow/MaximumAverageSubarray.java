package Java.DSAPatterns.SlidingWindow;

public class MaximumAverageSubarray {

    public static void main(String[] args) {

        int arr[] = { 1, 12, -5, -6, 50, 3 };
        int k = 4;
        System.out.println(maxAvgSubarrayBf(arr, k));
        System.out.println(maxAvgSubarraySlidingWindow(arr, k));
    }

    // brute force
    public static float maxAvgSubarrayBf(int arr[], int k) {

        float max = Integer.MIN_VALUE;

        for (int i = 0; i <= arr.length - k; i++) {
            float sum = 0;
            for (int j = i; j < k + i; j++) {
                sum = sum + arr[j];
            }
            float avg = sum / k;

            if (avg > max) {
                max = avg;
            }
        }
        return max;
    }

    // sliding window
    public static float maxAvgSubarraySlidingWindow(int arr[], int k) {

        int n = arr.length;
        float max_avg = Integer.MAX_VALUE;
        float win_sum = 0;
        for (int i = 0; i < k; i++) {
            win_sum += arr[i];
        }

        max_avg = win_sum / k;

        System.out.println("first_window sum : " + win_sum);
        int start = 0;
        int end = k - 1;
        while (end != n - 1 && start != n - k - 1) {
            end++;
            win_sum = win_sum + arr[end] - arr[start];
            start++;

            float temp = win_sum / k;
            if (temp > max_avg) {
                max_avg = temp;
            }
        }

        return max_avg;
    }

}
