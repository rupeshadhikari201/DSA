package Core;

import java.util.ArrayList;
import java.util.List;

public class Subset {

    public static void main(String[] args) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        // System.out.println(ans);
        int arr[] = { 1, 2, 3 };
        helper(arr, 0, res, ans);

        System.out.println(res);
    }

    public static void helper(int arr[], int start, List<List<Integer>> res, List<Integer> ans) {

        // base case
        if (start == arr.length) {
            // Add a copy of the current subset to the result
            res.add(new ArrayList<>(ans));
            return;
        }

        // exclude
        helper(arr, start + 1, res, ans);

        // include
        int temp = arr[start];
        ans.add(temp);
        helper(arr, start + 1, res, ans);

        // Backtrack by removing the last element
        ans.remove(ans.size() - 1);
    }
}
