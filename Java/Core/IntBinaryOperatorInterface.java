package CORE;
/* java.util.functions
 * It is one of a functional Interface
 * IntBinaryOperator takes two arguments and and returns only one.
 */
import java.util.function.*;
public class IntBinaryOperatorInterface {
    
    public static void main(String[] args) {
        
        IntBinaryOperator ibo = (int x, int y) ->{
            return x+y;
        };
        int outcome = ibo.applyAsInt(20, 20);
        System.out.println(outcome);
        System.out.println(ibo.applyAsInt(20, 20));;
    }
}
