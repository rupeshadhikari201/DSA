import java.util.ArrayList;
import java.util.Arrays;

class Pairs {

    public static void main(String[] args) {

        int a[] = { 5, 10, 15 };
        paris1(a);
    }

    public static void paris1(int a[]) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        // for (int i = 0; i < a.length; i++) {
        //     for (int j = 0; j < a.length; j++) {
        //         ArrayList<Integer> temp = new ArrayList<>();
        //         if (a[i] < a[j] && i != j) {
        //             temp.add(a[i]);
        //             temp.add(a[j]);
        //             res.add(temp);
        //         }
        //     }
        // }
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                ArrayList<Integer> temp = new ArrayList<>();
                if (a[i] < a[j]) {
                    temp.add(a[i]);
                    temp.add(a[j]);
                    res.add(temp);
                }
            }
        }
        System.out.println(res);
    }

    public static void sliding_window(int a[]) {
        

        // 1. sort the arrays
        Arrays.sort(a);
        int start = 0;
        int end = start+1;

        
    }
}