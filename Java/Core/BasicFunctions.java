package Core;

public class BasicFunctions {

    public static void main(String[] args) {

        String s = "Ramesh, is a good Boy, His rool no is : 1";
        System.out.println(s.toLowerCase());
        System.out.println(s.replaceAll("[^a-xA-Z0-9]", "").toLowerCase());

        String one = "racaecar";
        String two = "raceacar";
        System.out.println(one.equals(two));

        // The Math.log10(n) function in Java returns the base-10 logarithm of a number
        // n. It calculates the power to which 10 must be raised to obtain the value n.
        System.out.println("the no of digit in 123 is : " + (int) Math.log10(123) + 1);
        System.out.println((int) Math.log10(123) + 1);
    }
}
