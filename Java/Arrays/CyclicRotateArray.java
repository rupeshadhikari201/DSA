package Java.Arrays;

public class CyclicRotateArray {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5 };
        // Output:5 1 2 3 4
        rotate(arr, arr.length);

    }

    public static void rotate(int arr[], int n) {
        int res[] = new int[n];

        res[0] = arr[n - 1];
        for (int i = 0; i < n - 1; i++) {
            res[i + 1] = arr[i];
        }

        for (int i : res) {
            System.out.print(i + " ");
        }
    }

}
