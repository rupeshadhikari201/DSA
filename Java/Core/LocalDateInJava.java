package CORE;
import java.time.LocalDate;

/* LocalDate class 
 * LocalDate class is an immuatable class that inherits Object class and implements ChronoLocalDate Interface.
 */

class LocalDateInJava {
    public static void main(String[] args) {

        LocalDate data = LocalDate.now();
        System.out.println(data);

        String day = (String) LocalDate.of(2023, 1, 27).getDayOfWeek().toString();
    
        System.out.println(day);
    }
}