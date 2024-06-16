package Java.DSAPatterns.SlidingWindow;

/*
    Given an array of N elements, what is the
    smallest subarray size such that the sum of
    the elements is greater than or equal to some
    constant S?
    N = 10, S = 15
    {5, 1, 3, 5, 10, 7, 4, 9, 2, 8}
    Output: 2 [5,10]
    https://www.youtube.com/watch?v=nCcSwjFmfMM
 */
public class SmallestSum {
    public static void main(String[] args) {
        int N = 10;
        int S = 15;
        int arr[] = { 5, 1, 3, 5, 10, 7, 4, 9, 2, 8 };
        System.out.println(smallestSumArraySum(N, arr, S));
        System.out.println(SmallestSumSubarray(arr, S));
    }

    // bruteforce O(n^2)
    public static int smallestSumArraySum(int N, int arr[], int S) {
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum >= S) {
                    int currentLength = j - i + 1;
                    minLength = Math.min(currentLength, minLength);
                    break; // Exit the loop since we found a valid subarray
                }
            }
        }
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

    // sliding window (two pointer) O(n)
    public static int SmallestSumSubarray(int arr[], int target) {

        int min = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            // calculate the sum while sum does't becomes greater than target
            while (sum >= target) {
                min = Math.min(min, right - left + 1);
                // now reduce sum and increase left pointer
                sum -= arr[left++];
            }
        }
        return min;
    }
}
