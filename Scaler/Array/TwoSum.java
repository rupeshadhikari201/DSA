package Scaler.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*
 1. Implement 2SUM for unsorted and sorted array
*/

public class TwoSum {

    public static void main(String[] args) {

        int arr[] = { 11, 3, 7, 9, 14, 2 };
        // int arr[] = { 3, 2, 4 };
        int target = 10;

        System.out.println("Two Sum Brute Force  : " + Arrays.toString(twoSumBf(arr, target)));
        System.out.println("Two Sum HM           : " + twoSumHM(arr, target));
        System.out.println("Two Sum HashMap      : " + Arrays.toString(toSumHashMap(arr, target)));
        System.out.println("Two Sum TwoPointer   : " + twoSumTwoPointer(arr, target) + " makes " + target);

    }

    // Brute force
    public static int[] twoSumBf(int arr[], int target) {

        int ans[] = new int[2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == target && i != j) {
                    ans[1] = i;
                    ans[0] = j;
                }
            }
        }

        return ans;
    }

    // Optimal:
    // Observation : if target - arr[i] == ans (elements in the rest of array.)
    // than the indices will be the indices of arr[i] and ans.
    // Data Structure Used : HashMap

    public static ArrayList<Integer> twoSumHM(int arr[], int target) {

        ArrayList<Integer> res = new ArrayList<Integer>();
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], i);
        }

        // System.out.println(Arrays.asList(hs));
        // System.out.println(Collections.singletonList(hs));

        for (int i = 0; i < arr.length; i++) {

            int complement = target - arr[i];
            if (hm.containsKey(complement) && hm.get(complement) != i) {
                res.add(i);
                res.add(hm.get(target - arr[i]));
                break;
            }
        }

        return res;
    }

    // using two pointer to return the values that makes the target and not the
    // indices.
    public static ArrayList<Integer> twoSumTwoPointer(int arr[], int target) {

        ArrayList<Integer> res = new ArrayList<>();

        Arrays.sort(arr);

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            if (arr[start] + arr[end] == target) {
                res.add(arr[start]);
                res.add(arr[end]);
                break;
            } else if (arr[start] + arr[end] > target) {
                end--;
            } else {
                start++;
            }
        }

        return res;
    }

    // Using HashMap (Method:01)
    public static int[] toSumHashMap(int[] arr, int target) {

        int ans[] = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {

            int complement = target - arr[i];
            if (hm.containsKey(complement) && hm.get(complement) != i) {
                ans[0] = i;
                ans[1] = hm.get(target - arr[i]);
                break;
            }
        }

        return ans;
    }
}
