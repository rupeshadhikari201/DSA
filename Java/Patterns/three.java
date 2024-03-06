package Patterns;

/*
1
12
123
1234
12345
*/
public class three {
    public static void main(String[] args) {
        p3(5);
    }

    public static void p3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
