package Scaler.Array;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {

    public static void main(String[] args) {

        int arr[] = { 5, 5, 3, 5, 6, 5, 8, 5, 9, 5 };
        MajorityElementBf(arr);

    }

    // Using HM
    public static void MajorityElementBf(int arr[]) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println(Arrays.asList(hm));
    }

    // Using Moore Voiting Algorithm
    public static void MooreVotingAlgorithem(int arr[]) {

    }

}
