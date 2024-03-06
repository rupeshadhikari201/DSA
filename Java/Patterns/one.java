package Patterns;

public class one {

    public static void main(String[] args) {

        p1(5);
    }

    public static void p1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
