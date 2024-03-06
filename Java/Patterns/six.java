package Patterns;

/*
12345
1234
123
12
1
*/
public class six {

    public static void main(String[] args) {
        p6(5);
    }

    public static void p6(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
