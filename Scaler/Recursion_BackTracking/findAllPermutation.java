package Scaler.Recursion_BackTracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class findAllPermutation {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 4 };
        boolean selected[] = new boolean[arr.length];
        ArrayList<Integer> ans = new ArrayList<>();
        printPermutation(0, arr, selected, ans);
    }

    public static void printPermutation(int idx, int arr[], boolean selected[], ArrayList<Integer> ans) {

        // base case
        if (idx == arr.length) {
            System.out.println(ans);
        }
        for (int i = 0; i < arr.length; i++) {
            if (!selected[i]) {
                selected[i] = true;
                ans.add(arr[i]);
                printPermutation(idx + 1, arr, selected, ans);
                selected[i] = false;
                ans.remove(ans.size() - 1);
            }
        }
    }

}
