package Patterns;

/*
   A
  AB A
 ABC BA
ABCD CBA 

*/
public class seventeen {

    public static void p17_sub1(int n) {
        int gap = n - 1;
        for (int i = 0; i < n; i++) {
            int temp1 = 0;
            for (int j = 0; j < gap; j++) {
                System.out.print("* ");
            }
            for (int j = gap; j < n; j++) {
                char temp = (char) ('A' + temp1);
                System.out.print(temp + " ");
                temp1++;
            }
            gap--;
            System.out.println();
        }
    }

    public static void p17_sub2(int n) {
        for (int i = 0; i < n; i++) {
            int temp2 = i - 1;
            for (int j = 0; j < i; j++) {
                char temp = (char) ('A' + temp2);
                System.out.print(temp + " ");
                temp2--;
            }
            System.out.println();
        }
    }

    public static void p17(int n) {
        int gap = n - 1;
        for (int i = 0; i < n; i++) {
            int temp1 = 0;
            for (int j = 0; j < gap; j++) {
                System.out.print("  ");
            }
            for (int j = gap; j < n; j++) {
                char temp = (char) ('A' + temp1);
                System.out.print(temp + " ");
                temp1++;
            }
            int temp2 = i - 1;
            for (int j = 0; j < i; j++) {
                char temp = (char) ('A' + temp2);
                System.out.print(temp + " ");
                temp2--;
            }
            gap--;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        p17(4);
        // p17_sub1(4);
        // p17_sub2(4);
    }
}
