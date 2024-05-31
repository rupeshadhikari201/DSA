package Core;

public -interface myInterFace {

    public abstract void print();

    void show();

    void display(){

    }

    default void sayHello() {
        System.out.println("helllo");
    }

    private void sayHi() {
        System.out.println("hi");
    }
}

class A implements myInterFace {
    
    public void print() {
        System.out.println("print");
    }
}


public class InterfaceInJava {
    
    public static void main(String[] args) {
        
    }
}
