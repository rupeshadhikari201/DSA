package Core;

public class ArmstrongNumber {

    public static void main(String[] args) {
        int n = 371;
        boolean result = armstrong(n);
        System.out.println("the count is  : " + count_digit(n));
        System.out.println(result);
    }

    public static int count_digit(int n) {
        int count = 0;
        while (n >= 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static boolean armstrong(int num) {

        int sum = 0;
        int fix = num;
        while (num > 0) {
            int ld = num % 10;
            sum += Math.pow(ld, count_digit(fix));
            num /= 10;
        }

        if (sum == fix) {
            return true;
        } else {
            return false;
        }

    }
}
