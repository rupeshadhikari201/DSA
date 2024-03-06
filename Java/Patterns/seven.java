package Patterns;

/*

_ _ _ _ * 
_ _ _ * * 
_ _ * * * 
_ * * * * 
* * * * * 

_ _ _ _ * _ _ _ _
_ _ _ * * * _ _ _
_ _ * * * * * _ _
_ * * * * * * * _
* * * * * * * * * 

*/
public class seven {

    public static void main(String[] args) {
        // p7one(5);
        // p7two(5);
        // p7(3);
        gapsAndStars(3);
    }

    // using gaps and stars

    public static void gapsAndStars(int n) {
        int gap = n - 1; // (no of gap in first row)
        int stars = 1; // (no of stars in first row)

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < gap; col++) {
                System.out.print(" ");
            }
            for (int col = gap; col < gap + stars; col++) {
                System.out.print("*");
            }

            gap--;
            stars += 2;
            System.out.println();
        }
    }

    public static void p7one(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j >= n - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void p7two(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void p7(int n) {

        // increment n by 2
        n = n + 2;

        for (int i = 1; i <= (n / 2) + 1; i++) {
            for (int j = 1; j <= n; j++) {
                if (j >= n - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
