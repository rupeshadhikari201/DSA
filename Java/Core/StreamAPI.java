package CORE;
/* Stream API in java */

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.*;
// import java.util.function.Consumer;

public class StreamAPI {
    
    public static void main(String[] args) {
        
        List<Integer> age = Arrays.asList(34, 24, 23, 56, 19);
        
        // Consumer<Integer> con = new Consumer<Integer>() {
            
        //     public void accept(Integer n) {
        //         System.out.println(n);
        //     }
        // };

        // Consumer<Integer> con = (Integer n) -> {
        //         System.out.println(n);
        // };

        // Consumer<Integer> con = 

        age.forEach(n -> System.out.print(n + " "));
        System.out.println();

        Stream<Integer> s1 = age.stream();
        Stream<Integer> s2 = s1.sorted();
        Stream<Integer> s3 = s2.filter(n -> n % 2 == 0);
        Stream<Integer> s4 = s3.map(n -> n / 2);
        // s1.forEach(n -> System.out.print(n + " "));
        s4.forEach(n -> System.out.print(n + " "));

        //? lets understand filter
        Predicate<Integer> p = new Predicate<Integer>() {
           
            public boolean test(Integer n) {
                if (n%2 == 0)
                    return  true;
                else
                    return false;
            }
            
        };

        // Lets understand map
        Function<Integer, Integer> f = new Function<Integer, Integer>() {
            
            public Integer apply(Integer n) {
                return n / 2;
            }
        };

        int ageSUM = age.stream()
                        .sorted()
                        .filter(p)
                        .map(f)
                        .reduce(0,(c,e) -> c+e);

                        
        List<Integer> filteredAge = age.stream()
                        .sorted()
                        .filter(p)
                        .map(f)
                        .collect(Collectors.toList());
                        
        List<Integer> filteredAge2 = age.stream()
                        .sorted()
                        .filter(n-> n%2 ==0)
                        .map(n -> n / 2)
                        .collect(Collectors.toList());
                        
        System.out.println();
        System.out.println("FilteAge1 : " + filteredAge);
        System.out.println("FilteAge2 : " + filteredAge2);
        System.out.println("AgeSum : " + ageSUM);
        
    }
}
