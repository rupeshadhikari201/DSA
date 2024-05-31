package CORE;
interface Car {

    double salary = 50;
    void audi();

    void bmw();

    void tesla();

    void maruti();

    static void sayHI() {
        System.out.println("hi");
    }
}

abstract class A implements Car {
   
}

class B extends A {
    
    public void audi() {
        System.out.println("I am audi");
    }
    public void bmw(){
        System.out.println(" I am bmw");
    }
    public void tesla(){
        System.out.println(" I am tesla");
    }
    public void maruti(){
        System.out.println(" I am maruti");
    }
    @Override
    public void hello() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hello'");
    }
}
class AbstractClass {
    
    public static void main(String[] args) {
        
        Car c = new B();
        c.audi();
        c.maruti();
        c.tesla();
        c.bmw();
        // c.hello();

        System.out.println(Car.salary);
    }
}
