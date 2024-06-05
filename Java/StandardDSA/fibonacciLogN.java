package Java.StandardDSA;

public class fibonacciLogN {

    public static void main(String[] args) {

        System.out.println(fibLogN(2));

        for (int i = 0; i < 10; i++) {
            System.out.print(fibLogN(i) + " ");
        }

    }

    public static int fibLogN(int n) {

        if (n == 1)
            return 0;

        int a = 0;
        int b = 1;
        int c = 0;

        for (int i = 2; i <= n; i++) {

            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }

}
