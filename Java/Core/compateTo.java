package CORE;
public class compateTo {
    
    public static void main(String[] args) {
        
        /* compateTo() method in Java
         * this method compare the given string to current string lexicographically. 
         * it compares the strings on the basis of Unicode value of each characters in string 
         * it retuns +ve, -ve, or 0
         *          if first string is greater than second it returns +ve
         *          if first string is less than second it returns -ve
         *          if first stirng and second string is equal it returns 0
         * it throws two exception
         *          ClassCastException
         *          NullPointerException
         * empty string 
         *          if the first string is empty it returns -ve
         *          if the second string is empty it return +ve 
         */

        String s1 = "hello";
        String s2 = "mello";
        String s3 = "hello";

        System.out.println("s1 and s2 : " + s1.compareTo(s2));
        System.out.println("s2 and s1 : " + s2.compareTo(s1));
        System.out.println("s1 and s3 : " + s1.compareTo(s3));

        String s4 = " ";
        System.out.println("First string is empty " + s4.compareTo("hello"));
        System.out.println("Second string is empty " + s3.compareTo(" "));

        String str = null;
        try{
            
            System.out.println("First String is Null String  : "+ str.compareTo(s1));
            System.out.println("Second String is Null String : "+ s1.compareTo(str));
        }
        catch (NullPointerException n) {
            System.out.println(n);
        }

         
    }
}
