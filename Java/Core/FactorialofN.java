package Core;

import java.util.ArrayList;
import java.util.List;

public class FactorialofN {
    public static void main(String[] args) {
        int N = 5;
        System.out.println(fac(N));
        int arr[] = { 5, 1, 2, 4, 3 };
        int target = 7;
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println(TargetSum(0, arr, target, al));
        System.out.println(al);
    }

    public static int fac(int N) {

        // base case
        if (N == 1)
            return 1;

        return N * fac(N - 1);
    }

    public static boolean TargetSum(int start, int arr[], int target, List<Integer> currentSet) {

        // base case
        if (target == 0)
            return true;

        if (start == arr.length)
            return false;

        currentSet.add(arr[start]);
        if (TargetSum(start + 1, arr, target - arr[start], currentSet))
            return true;

        currentSet.remove(currentSet.size() - 1);
        return TargetSum(start + 1, arr, target, currentSet);

    }
}
