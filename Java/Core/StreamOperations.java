package CORE;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;

public class StreamOperations {
    public static void main(String[] args) {
        

        //Creating a list of Collection
        List<String> students = new ArrayList<>();
        students.add("Ritesh");
        students.add("Rupesh");
        students.add("Choki");
        students.add("Yared");
        students.add("Prins");

        // Stream<String> allStudents = students.stream();
        // allStudents.sorted()
        //         .map(item -> item.toUpperCase())
        //         .filter(item -> item.startsWith("R"))
        //         .forEach(item -> System.out.println(item));
            
        /* 
         * map takes function Interface : it takes one arguments and returns a result
         * filter takes predicate Interface : it takes one argument and returns a boolean
         * here forEach is a terminal operaton, so it should be at last
         */

        /* Streams can only be used once */
        //! allStudents.sorted().forEach(a -> System.out.print(a));
        /* The above line gies exception saying 
         * Stream has already been operated upon or closed
         */


        // Storing the result of stream in a variable of same kind
        // Stream<String> sortedStudents = students.stream();

        List<String> sortedStudents = students.stream()
                .sorted()
                .map(item -> item.toUpperCase())
                .filter(item -> item.startsWith("R"))ZipEntry
                .collect(Collectors.toList());

        List<String> sortedStudents2 = students.stream()
                .sorted()
                .collect(Collectors.toList());


        System.out.println("The list of unsorted students are :" + students);
        System.out.println("The lis of sorted students are : " + sortedStudents);
        System.out.println("The sorted list is : "+ sortedStudents2);
    }
    
}
