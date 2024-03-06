package Patterns;

/*
* * * * * * * * *
_ * * * * * * * _
_ _ * * * * * _ _ 
_ _ _ * * * _ _ _
_ _ _ _ * _ _ _ _

*/
public class eight {

    public static void main(String[] args) {
        p8(5);
    }

    public static void p8(int n) {
        int stars = n + (n - 1);
        System.out.println(stars);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            stars -= 1;
        }
    }
}
