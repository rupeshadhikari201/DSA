package CORE;
/* Singleton Design means that only once instance of a class can be created
 * Method 01: 
 ?      steps: 1. create a static instance of a class
 ?      steps: 2. create a private constructor
 ?      steps: 3. create a static method of returning the object of a class
 */

class A {
    
    static A obj = new A();

    private A() {
        System.out.println("object created");
    }
    
    public static A getInstance() {
        return obj;
    }
}

public class SingletonDesign {
    
    public static void main(String[] args) {
        
        // Thread t1 = new Thread (Runnable)

        // A obj1 = A.getInstance();
        // A obj2 = A.getInstance();
        // A obj3 = A.getInstance();



    }
}
