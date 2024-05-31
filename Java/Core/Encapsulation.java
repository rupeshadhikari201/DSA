package CORE;
class Person {
    
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name, Person p1) {
        p1.name = name;
    }

    public void setAge(int age, Person p1) {
        p1.age = age;
    }
    
    /* This Keyword
     * 1. This keyword holds the object of current class.
     * 2. This keyword represents the current object.
     * 3. This keyword is used when instance and local variable have same name. To diffrentiate.
     */
    public void setName(String name) {
        this.name = name;
    }   

    public void setAge(int age) {
        this.age = age;
    }

    
}


public class Encapsulation {
    public static void main(String[] args) {
        
        Person p1 = new Person();
        p1.setAge(24, p1);
        p1.setName("Rupesh", p1);
        
        Person p2 = new Person();
        p2.setName("Ritesh");
        p2.setAge(20);

        System.out.println(p1.getName() + " : " + p1.getAge());
        System.out.println(p2.getName() + " : " + p2.getAge());
    }
}
