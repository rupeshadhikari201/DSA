package CORE;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/* Set
 * 1. Set has unique value
 * 2. TreeSet is sorted set
 */
public class SetClass {  
    
    public static void main(String[] args) {

        Set<Integer> uid = new TreeSet<Integer>();
        uid.add(15);
        uid.add(45);
        uid.add(59);
        uid.add(84);

        Set<String> names = new HashSet<String>();
        names.add("Ram");
        names.add("Shyam");
        names.add("Hari");
        names.add("Geeta");
        names.add("Mohan");

        for (int n : uid) {
            System.out.println(n);
        }

        Iterator<String> allName = names.iterator();
        while (allName.hasNext()) {
            System.out.println(allName.next());
        }
    
        
    }
}
