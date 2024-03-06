package Core;

public class SumOfDivisors {

    public static void main(String[] args) {
        int n = 5;
        int res = 0;
        for (int i = 0; i <= n; i++) {
            res += sum_of_divisor(i);
        }
        // System.out.println(res);

        // int res2 = 0;
        // for (int i = 0; i <= n; i++) {
        // res2 += sum_of_divisors(i);
        // }
        System.out.println(sum_of_divisors(2));
    }

    public static int sum_of_divisor(int n) {

        int sum = 0;
        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static int sum_of_divisors2(int n) {

        int sum = 1;
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {

            if (n % i == 0) {
                sum += i;

                if (i != n / i) {
                    sum += n / i;
                }
            }

        }

        return sum;
    }

    public static int sum_of_divisors(int n) {
        int sum = 1; // Start with 1 as it is always a divisor.
        int sqrtN = (int) Math.sqrt(n);

        for (int i = 2; i <= sqrtN; i++) {
            if (n % i == 0) {
                sum += i;

                // If i and n/i are different, add n/i as well.
                if (i != n / i) {
                    sum += n / i;
                }
            }
        }

        return sum;
    }
}
