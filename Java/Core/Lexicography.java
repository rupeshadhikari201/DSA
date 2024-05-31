package CORE;
import java.util.Scanner;

public class Lexicography {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String AB = A.concat(B);
        int len = AB.length();
        System.out.println(len);

        int lex = A.compareTo(B);

        if (lex > 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
       
        String firstLetter = A.substring(0, 1).toUpperCase();
        String remainingLetter = A.substring(1);
        String FirstWord = firstLetter + remainingLetter;


        String firstLetter2 = B.substring(0, 1).toUpperCase();
        String ramainingLetter2 = B.substring(1);
        String SecondWord = firstLetter2 + remainingLetter;

        System.out.println(FirstWord +" "  + SecondWord);
        
    }
}
