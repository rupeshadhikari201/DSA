package CORE;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.List;


/* Stream in Java
 * Stream was introduced in java 1.8 
 * java.util.stream package contains interfaces, classes and enums to allow functional type operations elements
 * 
 */

/* Method to create a Stream
 * 1. From a list or Collection
 * 2. 
 */
public class JavaStream {

    public static void main(String[] args) {
        

        //Stream from an array
        Integer marks[] = { 34, 56, 88, 23, 76, 76 };
        Stream<Integer> studMarks = Arrays.stream(marks);
        studMarks.sorted().forEach(item -> System.out.println("The sorted marks are : " + item));;
     


        //Stream from a List
        List<String> allStudents = new ArrayList<>();
        allStudents.add("Ritesh");
        allStudents.add("Prins");
        allStudents.add("Milan");
        allStudents.add("Abdul");
        allStudents.add("Milan");
        allStudents.add("Yared");
        Stream<String> students = allStudents.stream();
        students.sorted().forEach(studs -> System.out.println("The sorted studests are : "+ studs));




        //? Method :02
        Stream<Integer> age = Stream.of(34, 23, 42, 12, 25);
        System.out.print("The sorted age is : ");
        age.sorted().forEach(a -> System.out.print(a + "\t"));
        System.out.println();
        Stream<String> person = Stream.of("Ramesh", "Mahesh", "Suresh", "Dinesh");
        System.out.print("The sorted names are : ");
        person.sorted().forEach(p -> System.out.print(p + "\t"));
    }
    
}
