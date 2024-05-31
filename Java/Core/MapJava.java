package CORE;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import javax.security.auth.callback.ChoiceCallback;

import java.util.Hashtable;
// import java.util.HashTable;

/* Map in Java
 * Map has key and value pair,
 * keys are basically a Set and values are basically List
 * Map has two important Interface: i.  Map
 *                                  ii. SortedMap
 * Map has three important classes: i.  TreeMap
 *                                  ii.  HashMap / HashTable(Syncronized by default)
 *                                  iii. LinkedHashMap
 */
public class MapJava {

    public static void main(String[] args) {
        
        Map<String, Integer> students = new Hashtable<String, Integer>();
        students.put("Ritesh", 49);
        students.put("Milan", 39);
        students.put("Prins", 29);
        students.put("Bnak", 40);
        students.put("Ritesh", 50);
        students.put("choki", 50);
        students.putIfAbsent("Rupesh", 90);
        students.putIfAbsent("Rupesh", 100);

        System.out.println("The value of Ritesh is : "+ students.get("Ritesh"));
        System.out.println("The set of entrySet is : " + students.entrySet());
        System.out.println("The set of keySet is : " + students.keySet());
        System.out.println("The list of values is : " + students.values());
        System.out.println(students.putIfAbsent("Rupesh", 90));
        System.out.println(students.putIfAbsent("Rupesh", 100));

        System.out.println("The Names and Mark of all the students are : ");
        for (String allName : students.keySet()) {
            System.out.println(allName + ": " + students.get(allName));
        }
        
        /* Printing using Itterator Interface
         * Step  01 : Convert Map to Set
        */

        Set set = students.entrySet();
        System.out.println("All the elements in a set is : " + set);
        Iterator allStudents = set.iterator();
        System.out.println("All the elements in the set is : ");
        while (allStudents.hasNext()) {
            System.out.println(allStudents.next());
        }

        SortedMap<String, Integer> person = new TreeMap<String, Integer>();
        person.put("Ritesh", 49);
        person.put("Milan", 39);
        person.put("Prins", 29);
        person.put("Bnak", 40);
        person.put("Ritesh", 50);

        // System.out.println(person.get("Ritesh"));
        // System.out.println(person.entrySet());

        // Looping via enhanced for loop
        System.out.println("Looping throught Map elements directly using enhanced for loop : ");
        for (Map.Entry m : students.entrySet()) {
            System.out.println(m.getKey()  + " : " + m.getValue());
        }

    }
    
}
