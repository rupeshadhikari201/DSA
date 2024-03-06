package Patterns;

/*
_ _ _ _ * _ _ _ _
_ _ _ * * * _ _ _
_ _ * * * * * _ _
_ * * * * * * * _
* * * * * * * * *
* * * * * * * * *
_ * * * * * * * _
_ _ * * * * * _ _ 
_ _ _ * * * _ _ _
_ _ _ _ * _ _ _ _ 

*/

public class nine {

    public static void p9(int n) {

        int stars1 = 1;
        int stars2 = n + (n - 2);
        System.out.println(stars2);
        int gap = n - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < gap; j++) {
                System.out.print(" ");
            }
            for (int j = gap; j < gap + stars1; j++) {
                System.out.print("*");
            }
            gap--;
            stars1 += 2;
            System.out.println();

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= stars2; j++) {
                System.out.print("*");
            }
            stars2 -= 1;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        p9(5);
    }
}
