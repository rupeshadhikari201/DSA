package Java.POTD;

import java.util.ArrayList;
import java.util.Arrays;

// Java/POTD/SeiveofEratosthenes.java
public class SeiveofEratosthenes {
    public static void main(String[] args) {

        // 2,3,5,7,11
        soe(10);
    }

    public static void soe(int n) {

        boolean arr[] = new boolean[n];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = true;
        }

        arr[0] = arr[1] = false;

        for (int i = 2; i < arr.length; i++) {

            if (arr[i]) {
                count++;
            }
            for (int j = 2 * i; j < n; j = j + i) {
                arr[j] = false;
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == true) {
                res.add(i);
            }
        }
        System.out.println(res);
        TwoSum(res, 0);
    }

    // twosum
    public static void TwoSum(ArrayList<Integer> res, int target) {

        int start = 0;
        int end = res.size() - 1;
        ArrayList<Integer> ans = new ArrayList<>();
        while (start <= end) {

            int sum = res.get(start) + res.get(end);
            if (sum == target) {
                ans.add(res.get(start));
                ans.add(res.get(end));
                break;
            }
            if (sum > target) {
                end--;
            } else {
                start++;
            }
        }
        System.out.println(ans);
    }
}