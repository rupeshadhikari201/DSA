package Scaler.Array;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {

        int nums[] = { -1, 0, 1, 2, -1, -4 };
        int target = 0;

        System.out.println("Using Bruteforce : " + ThreSumBf(nums, target));
        // HashSet<Integer> s1 = new HashSet<>(Arrays.asList(-1, 0, 1));
        // HashSet<Integer> s2 = new HashSet<>(Arrays.asList(0, 1, -1));
        // System.out.println(s1.equals(s2));
        System.out.println("Using HashMap    : " + ThreeSumHm(nums, target));
        System.out.println("Using TwoPointer : " + ThreeSumTwoPointer(nums, target));

    }

    // Brute Force
    public static ArrayList<ArrayList<Integer>> ThreSumBf(int arr[], int target) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        HashSet<HashSet<Integer>> hs = new HashSet<>();

        int len = arr.length;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                for (int k = j + 1; k < len; k++) {
                    if (arr[i] + arr[j] + arr[k] == target
                            && !hs.contains(new HashSet<>(Arrays.asList(arr[i], arr[j], arr[k])))) {

                        ArrayList<Integer> arrtemp = new ArrayList<>();
                        HashSet<Integer> hstemp = new HashSet<>();

                        // add to the ArrayList as one of the ans
                        arrtemp.add(arr[i]);
                        arrtemp.add(arr[j]);
                        arrtemp.add(arr[k]);

                        // add to the HashSet to maintain unique triplets
                        hstemp.add(arr[i]);
                        hstemp.add(arr[j]);
                        hstemp.add(arr[k]);

                        hs.add(hstemp);
                        res.add(arrtemp);
                    }
                }
            }
        }

        return res;
    }

    // Using HashMap
    public static ArrayList<ArrayList<Integer>> ThreeSumHm(int arr[], int target) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        HashSet<HashSet<Integer>> hs = new HashSet<>();

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println("this is first time" + Arrays.asList(hm));

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                // reduce the count
                hm.put(arr[i], hm.get(arr[i]) - 1);
                hm.put(arr[j], hm.get(arr[j]) - 1);

                HashSet<Integer> hstemp = new HashSet<>(Arrays.asList(arr[i], arr[j], target - arr[i] - arr[j]));

                if (hm.containsKey(target - arr[i] - arr[j]) && !hs.contains(hstemp)
                        && hm.get(target - arr[i] - arr[j]) > 0) {

                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(target - arr[i] - arr[j]);

                    res.add(temp);
                    hs.add(hstemp);

                }

                // add back the count
                hm.put(arr[i], hm.get(arr[i]) + 1);
                hm.put(arr[j], hm.get(arr[j]) + 1);
            }
        }

        return res;
    }

    // using Two Pointer
    public static ArrayList<ArrayList<Integer>> ThreeSumTwoPointer(int arr[], int target) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {

            int sum = target - arr[i];

            int start = i + 1;
            int end = arr.length - 1;

            while (start < end) {

                if (sum == arr[start] + arr[end]) {
                    ArrayList<Integer> temp = new ArrayList<Integer>(Arrays.asList(arr[i], arr[start], arr[end]));
                    res.add(temp);
                    break;
                }
                if (arr[start] + arr[end] > sum) {
                    end--;
                } else {
                    start++;
                }
            }

        }

        return res;
    }
}
