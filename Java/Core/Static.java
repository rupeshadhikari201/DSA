package CORE;
/* Static 
 * We dont need to create an object of static variable, or methods
 * It can be directly accessed by class name itself. 
 * The object of static variable is only created only once no matter how many times it is instanciated
 * We can access static variable in non static methods, like in print() method
 * we can keep static variables in static block because the variables in static block is instanciated only once
 * A static variable becomes common to all the objects 
 * Steps involved in creating an object
 *          step 01 :- First the class loads by special area in JVM called classloader. [it happens only once]
 *          step 02 :- Objects get Instanciated
 * 
 * If we want to load the class without creating the object than we need to use Class.forName("ClassName");
 */

/* Static Method
 * 1. We Can use a static variable inside a non static function. [ see print() function ]
 * 2. But, we cannot  use a non static variable inside a static function directly. [ see printf() function ]
 *    We can pass an object to the static function while calling and accept the object while defining the function.
 * 
 */
class Mobile {
    
    String brand;
    int price;
    static String category;

    public void print() {
        System.out.println("printing from non static function");
        System.out.println(brand + " : " + price + " : " + category);
    }

    public static void printf(Mobile m) {
        System.out.println("printing from static function");
        System.out.println(m.brand + " : " + m.price + " : " + category);
    }
    static 
    {
        Mobile.category = "phone";
        System.out.println("in static block ");
    }

    public Mobile() {
        brand = "NoBrand";
        price = 000;
        System.out.println("inside constructor");

    }
}   

public class Static {
    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("Mobile");
     
        // Mobile m = new Mobile();
        // m.brand = "Samsung";
        // m.price = 200;
        // // Mobile.category = "Smart Phone";

        // Mobile n = new Mobile();
        // n.brand = "Nokia";
        // n.price = 500;
        // // Mobile.category = "Smart Phone";

        // Mobile o = new Mobile();

        

        // m.print();
        // n.print();      

    }
}
