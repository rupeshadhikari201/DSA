package Patterns;
/*
*****
****
***
**
*
*/

public class five {
    public static void main(String[] args) {
        p5(5);
    }

    public static void p5(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
