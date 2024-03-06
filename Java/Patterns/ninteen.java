package Patterns;

/* 
* * * * * * * * * *
* * * *     * * * *
* * *         * * *
* *             * *
*                 *
*                 *
* *             * *
* * *         * * *
* * * *     * * * *
* * * * * * * * * * 

*/
public class ninteen {

    public static void p19(int n) {
        int gap = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - gap; j++) {
                System.out.print("*" + " ");
            }
            for (int j = n - gap; j < n + gap; j++) {
                System.out.print(" " + " ");
            }
            for (int j = n + gap; j < 2 * n; j++) {
                System.out.print("*" + " ");
            }
            gap += 1;
            System.out.println();
        }

        int gap2 = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }
            for (int j = n; j < gap2 + n; j++) {
                System.out.print(" " + " ");
            }
            for (int j = gap2 + n; j < 2 * n; j++) {
                System.out.print('*' + " ");
            }
            gap2--;
            System.out.println();
        }
    }

    public static void p19_sub1(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void p19_sub2(int n) {
        for (int i = n; i > 0; i--) {
            int start = n + 1;
            int end = n + n;
            int gap = start + n - i;
            for (int j = start; j < gap; j++) {
                System.out.print(" " + " ");
            }
            for (int j = gap; j <= end; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void p19_sub3(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void p19_sub4(int n) {
        int gap2 = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = n; j < gap2 + n; j++) {
                System.out.print(" " + " ");
            }
            for (int j = gap2 + n; j < 2 * n; j++) {
                System.out.print('*' + " ");
            }
            gap2--;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        p19(5);
        // p19_sub1(5);
        // p19_sub2(5);
        // p19_sub3(5);
        p19_sub4(5);
    }
}
