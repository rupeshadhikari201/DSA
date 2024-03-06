package Patterns;

/* 
E 
D E
C D E
B C D E
A B C D E

*/
public class eighteen {

    public static void p18(int n) {
        for (int i = 0; i < n; i++) {
            int temp = n - i;
            for (int j = 0; j <= i; j++) {
                char temp2 = (char) (64 + temp);
                System.out.print(temp2 + " ");
                temp++;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        p18(5);
    }
}
