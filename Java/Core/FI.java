package CORE;
/* Functional Interface in java
 * Functional Interface are those interface that have exactly only one abstrac method.
 * But int can have any number of default and static methods + object class methods
 * A functional Interface can only Implement another interface if it does not have any abstract methods
 * Lambda Functions implements Functional Interface
 */

import java.lang.FunctionalInterface;

@FunctionalInterface
interface Greeting {

    public void greet();
}

// class SayHello implements Greeting {
    
//     public void greet() {
//         System.out.println("Helllo");
//     }
// }
public class FI{

    public static void main(String[] args) {

        // Greeting g1 = new SayHello();
        // g1.greet();
        
        // SayHello hlo = new SayHello();
        // hlo.greet();

        // Direct Implementation without creating SayHello class
        Greeting g = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Direct Hello without SayHello class");
            }
        };

        g.greet();
    }
}