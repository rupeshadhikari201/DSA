package Arrays;

import java.util.ArrayList;

/* Subarray
A subarray of an array is a contiguous part of the array. In other words, it's a slice of the original array that maintains the relative order of elements. 
    👉🏻 Number of subarrays = n * (n + 1) / 2
    for n = 3, subarray = 6
*/
public class MaximumSubarraySum {
    public static void main(String[] args) {

        int arr[] = { 5, 4, -1, 7, 8 };

        // Print all subarrays
        System.out.println("Total no of of subarray for size : " + arr.length + " is " + findAllSubArray(arr).size());
        System.out.println("THe maximum sum of Subarray Using Kadan's Algorithm is : " + KadansAlgorithm(arr));
        findMaxSumInArrayListOfArrayList(findAllSubArray(arr));

    }

    public static int KadansAlgorithm(int arr[]) {
        int maxSum = arr[0];
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {

            currentSum = currentSum + arr[i];

            maxSum = Math.max(maxSum, currentSum);

            if (currentSum < 0) {
                currentSum = 0;
            }

        }
        return maxSum;
    }

    public static ArrayList<ArrayList<Integer>> findAllSubArray(int arr[]) {
        ArrayList<ArrayList<Integer>> subarrays = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = i; j < arr.length; j++) {
                temp.add(arr[j]);
                // add a copy of temp to subarrays.
                subarrays.add(new ArrayList<>(temp));
            }
        }
        return subarrays;
    }

    public static void printSubarry(int arr[]) {
        for (ArrayList<Integer> subarray : findAllSubArray(arr)) {
            System.out.println(subarray);
        }
    }

    public static void findMaxSumInArrayListOfArrayList(ArrayList<ArrayList<Integer>> listOfList) {
        int max = Integer.MIN_VALUE;
        for (ArrayList<Integer> list : listOfList) {

            // int sum = list.stream().reduce(0, Integer::sum);
            int sum = list.stream().mapToInt(Integer::intValue).sum();
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println("The maximum sum of subarry is : " + max);
    }
}
