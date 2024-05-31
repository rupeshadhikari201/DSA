package Core;

abstract class A {
    
    final void finalMethod() {
        System.out.println("final method");
    }

    abstract void print();

    abstract void show();


    void display() {
        System.out.println("Display");
    }
}

class B extends A {

    void print() {
        System.out.println("print");
    }

    void show() {
        System.out.println("show");
    }
}

class  C extends B{
    
}
public class finalVsAbstract {

    

    
}
