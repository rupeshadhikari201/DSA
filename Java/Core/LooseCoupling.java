package CORE;
/* Loose Coupling in Java
 * one Interface reference variable can hold different types of implementation of class memories
 * In Loose Coupling, the class or method is less dependent on other classes and methods.
 */

interface I {
    public abstract void run();
}

class A implements I {
    
    public void run() {
        System.out.println("in class A");
    }
}
class B implements I {
    
    public void run() {
        System.out.println("in class B");
    }
}
class C implements I {
    
    public void run() {
        System.out.println("in class C");
    }
}

public class LooseCoupling {
    
    public static void main(String[] args) {
        
        I obj;
        obj = new A();
        obj.run();

        obj = new B();
        obj.run();

        obj = new C();
        obj.run();
    }
}
