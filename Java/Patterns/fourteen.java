package Patterns;

/*
A
A B
A B C 
A B C D
A B C D E

 */
public class fourteen {

    public static void p14(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                int l = j + 65;
                char temp = (char) l;
                System.out.print(temp);
            }
            System.out.println();
        }
    }

    public static void p14_second(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                char temp = (char) ('A' + j);
                System.out.print(temp);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // p14(5);
        p14_second(5);
    }
}
