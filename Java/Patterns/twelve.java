package Patterns;

/*

1      1
12    21
123  321
12344321

* Sub Challange

   1
  21
 321
4321

*/
public class twelve {

    public static void p12_sub(int n) {

        int gap = n - 1; // 3
        int star = n - gap; // 1

        for (int i = 1; i <= n; i++) {
            for (int j = n; j > star; j--) {
                System.out.print(" ");
            }
            for (int j = star; j > 0; j--) {
                System.out.print(j);
            }

            gap--;
            star++;
            System.out.println();
        }

    }

    public static void p12(int n) {

        int gap = n - 1; // 3
        int star = n - gap; // 1

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i + 1; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = n; j > star; j--) {
                System.out.print(" ");
            }
            for (int j = star; j > 0; j--) {
                System.out.print(j);
            }

            gap--;
            star++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        p12(5);
        // p12_sub(4);
    }
}
