package Patterns;

/*
1
22
333
4444
55555
*/
public class four {

    public static void main(String[] args) {
        p4(5);
    }

    public static void p4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
