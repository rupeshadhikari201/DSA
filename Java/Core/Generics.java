package CORE;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* Generics in Java
 * Generics deals with type safety. It makes the code stable by detecting the code at compile-time
 * Before Generics, we can store any type of object in a Collection, now generics force the programmers
 * to store the specific type of objects.
 * The Three advantage of generics are:-
 *         1. Type Safe: we can hold only single type of objects.
 *         2. Typecast : Typecasting is not required.
 *         3. Compile time checking :  It checks the error at compile time.  
 */
public class Generics {
    
    public static void main(String[] args) {

        Collection<Integer> phone = new ArrayList<Integer>();
        phone.add(2837347);
        phone.add(2837347);
        phone.add(2837347);
        phone.add(2837347);
        phone.add(2837347);

        for (Integer n : phone) {
            System.out.println(n);
        }

        // Example with out Generics
        List names = new ArrayList();
        names.add("Rupesh");
        names.add("Ritesh");
        names.add(10);
        String name1 = (String)  names.get(0);
        String name2 = (String) names.get(1);
        System.out.println(name1);
        System.out.println(name2);


        // Example with Generics
        List<String> address = new ArrayList<String>();
        address.add("Rupesh");
        address.add("Milan");
        address.add(2, "Ritesh");
        address.add(3, "Prins");
        // address.add(7);
        // String add1 = address.get(0);
        // String add2 = address.get(1);
        // String add3 = address.get(2);
        // String add4 = address.get(3);

        System.out.println("The inded of princs is : " + address.indexOf("Prins"));
        System.out.println(address.size());
        System.out.println(address.getClass());

        System.out.println(address);
        for (String add : address) {
            System.out.println(add);
        }
    }
}
