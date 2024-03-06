package Core.Core;

public class IsPrime {

    public static void main(String[] args) {
        System.out.println(is_prime(9));
    }

    public static int is_prime(int n) {

        // base case
        if (n <= 1) {
            return 0;
        }

        if (n == 2) {
            return 1;
        }
        if (n % 2 == 0) {
            return 0;
        }

        for (int i = 3; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0;
            }
        }

        return 1;
    }
}
