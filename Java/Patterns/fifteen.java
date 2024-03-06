package Patterns;

/*
A B C D E
A B C D
A B C
A B
A

*/
public class fifteen {

    public static void p15(int n) {
        for (int i = n; i > 0; i--) {
            int temp = 0;
            for (int j = i; j > 0; j--) {
                char temp2 = (char) (temp + 65);
                System.out.print(temp2 + " ");
                temp++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        p15(5);
    }
}
