package Scaler.Array;

public class DigitMultiplier {

    public static void main(String[] args) {

        int N = 1000;

        int arr[] = new int[10];
        String ans = "";
        for (int i = 9; i >= 2; i--) {
            while (N % i == 0) {
                N = N / i;
                arr[i] = arr[i] + 1;
                ans = i + ans;

            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        int sum = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum *= (int) Math.pow(i, arr[i]);

            }
        }
        System.out.println();
        System.out.println(sum);

        if (N != 1) {
            System.out.println("-1  ");
        } else {
            System.out.println(ans);
        }
    }
}
