package Patterns;

/*
A
B B
C C C
D D D D
E E E E E

*/
public class sixteen {

    public static void p16(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                char temp = (char) ('A' + i);
                System.out.print(temp);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        p16(5);
    }
}
