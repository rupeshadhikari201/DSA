package Patterns;

/*
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1 

*/
public class eleven {

    public static void p11(int n) {
        int start = 1;
        for (int i = 0; i <= n; i++) {
            if (start % 2 == 0)
                start = 1;
            else
                start = 0;

            for (int j = 0; j < i; j++) {
                if (j % 2 == 0) {
                    System.out.print(start);
                }
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        p11(5);
    }
}
