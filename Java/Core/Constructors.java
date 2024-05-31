package CORE;
/* Constructors and super()
 * 1. Every Constructor in java have super() method by default
 * 2. Every Class in java extends Object Class
 */

class A {

    public A() {
        super();
        System.out.println("in A default");
    }

    public A(int n) {
        super();
        System.out.println("in A parametrized : "+ n);
    }
}

class B extends A {

    public B() {
        super();
        System.out.println("in B default");
    }

    public B(int n) {
        super();
        System.out.println("in B parametrized : "+ n);
    }
}

public class Constructors {
    public static void main(String[] args) {
        
        B b = new B(5);
    }
    
}
