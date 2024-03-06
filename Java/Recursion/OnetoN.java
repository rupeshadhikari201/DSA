package Recursion;

public class OnetoN {

    public static void main(String[] args) {
        one_to_n(5);
    }

    public static void one_to_n(int n) {

        if (n > 1) {
            one_to_n(n - 1);
        }
        System.out.print(n + " ");
    }

}
