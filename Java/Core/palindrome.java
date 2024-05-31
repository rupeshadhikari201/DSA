package CORE;
public class palindrome {

    public static void main(String[] args) {
        
        // int num = 424;
        // int temp = num;
        // int sum = 0;

        // while (num > 0) {

        //     int rem = num % 10;
        //     sum = rem + sum * 10;
        //     num = num / 10;

        // }

        // if (temp == sum) {
        //     System.out.println("Yes");
        // } else {
        //     System.out.println("No");
        // }
        // System.out.printf("The reverse of %d is : %d" , temp, sum);

        String s = "hello";

        int i = 0;
        int j = s.length() -1;
        int flag = 0;

        while (i < j && flag == 0) {
            
            if (s.charAt(i) != s.charAt(j)) {
                flag = 1;
            }
            else {
                flag = 0;
            }

            i++;
            j--;
        }
        if (flag == 0) {
            System.out.println("Yes Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        
    }
    
}
