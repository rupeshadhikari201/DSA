package CORE;

interface Country {
    // String india;
    // variables are static and final in interface

    // member variables of interface is public by default but abstract class can be protected or private

}

final class vehicles {

    final void sayHello() {
        System.out.println("hello");
    }

    final void sayHello(String s) {
        System.out.println("Hello " + s);
    }
}

// class Car extends vehicles {
//*  FINAL CLASS CANT BE EXTENDED
// }

class Hello{

    final void hello() {

    }

    void helloAgain() {

    }
}

// public void finalize(){}
class SayHello extends Hello{

    // void hello() {
    //      ? cant override final method from its child class
    // }

    void helloAgain() {
        
    }
}

public class FinalClass {


    FinalClass fc1 = new FinalClass();
    FinalClass fc2 = new FinalClass();

    String strarray[] = {"Rupesh", "Ramesh"};


    public  void main(String[] args) {

        final int i;
        i = 10;
        System.out.println(i);
    }


    // overloading static method
    static void print(String name) {
        System.out.println(name);
    }

    static void print(String name, int id) {
        System.out.println(name+ " " + id);
    }
}