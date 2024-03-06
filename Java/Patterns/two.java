package Patterns;

public class two {

    public static void main(String[] args) {
        p2(5);
    }

    public static void p2(int n) {

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
