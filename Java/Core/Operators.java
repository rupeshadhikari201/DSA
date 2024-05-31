package CORE;

public class Operators {

    public static void main(String[] args) {
        
        /*  Opetarors in java
         * 1. Unary: postfix, prefix
         * 2. Assignment 
         * 3. Arithmetic
         * 4. Logical  [ &&, || ]
         * 5. Relational/Comparison
         * 6. Shift
         * 7  Bitwise [ &, ^, | ]
         * 8 Ternary
         */

        //1. Unary Operator
        int num1 = 10;
        int num2 = 20;
        // System.out.println(num1++);
        // System.out.println(++num2);
        System.out.println("value of num1 is : "+ num1);
        int c = num1++ + num2;
        System.out.println("value of num1 is : "+ num1);
        int d = ++num1 + num2;
        System.out.println("value of num1 is : "+ num1);
        System.out.println(c);
        System.out.println(d);
    
    

    /* Bitwise Operator in Java
     * 1. Bitwise AND (&)
     * 2. Bitwise Exclusive OR (^)
     * 3. Bitwise Inclusive OR (|)
     * 4. Bitwise Complement (~)
     * 5. Shift Operator
     *      5.1  Signed Left Shift (<<)
     *      5.2  Signed Right Shift (>>)
     *      5.3  Unsigned Right Shift (>>>)
     */

    int a = 5, b = 6;
    System.out.println();
    System.out.println("The output of AND (&) is : " + (a & b));
    System.out.println("The output of ExOR (^) is : " + (a ^ b));
    System.out.println("The output of InOR (|) is : " + (a | b));
    System.out.println("The output of NOT (~) is : " + (~a));

    System.out.println();
    System.out.println("The outpt of Signed Right Shift (>>) is  : "+ (5>>2)); //? b = a/2^n
    System.out.println("The outpt of Signed Left Shift (<<) is   : "+ (5<<2)); //? b = a*2^n
    System.out.println("The outpt of UnSigned Right Shift (>>>) is : " + (5 >>> 2)); //? 

    /* Ternary Operator
     * condn?true:false
     */
    int number1 = 10;
    int number2 = 20;
    int max = number1 > number2 ? number1 : number2;
    System.out.println();
    System.out.println("The Greater Numebe is : " + max);
    }
}
