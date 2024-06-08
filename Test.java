import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Test {

    public static void main(String[] args) {

        int nums[] = { -1, 0, 1, 2, -1, -4 };
        // Output: [[-1,-1,2],[-1,0,1]]
        threeSum(nums);
    }

    public static ArrayList<ArrayList<Integer>> threeSum(int arr[]) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        HashSet<ArrayList<Integer>> hs = new HashSet<>();
        int target = 0;

        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        // System.out.println(Arrays.asList(hm));
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                ArrayList<Integer> stemp = new ArrayList<>();
                int temp = target - arr[i] + arr[j];
                if (hm.containsKey(temp)) {

                }
            }
        }

        return res;

    }
}
