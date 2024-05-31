package CORE;
import java.util.Random;

// @FunctionalInterface
interface Calculator {
    public int calculate(int x, int y);
}

// @FunctionalInterface
interface Greeting{
    public void greet();
}

public class LamdaExpressions {

    public static void main(String[] args) {
        
        Calculator cal = ( x, y) -> {
            int randomNumber = (int) (Math.random() * 100);
            System.out.println("The First randomNumber is  : " +    randomNumber);

            Random random = new Random();
            int randomSecond = random.nextInt(50);
            System.out.println("The second random number is : " + randomSecond);
            
            // int c = x + y + randomNumber;
            // System.out.println("The sum is : " + c);

            return x * y + randomNumber + randomSecond;
        };
        // cal.calculate(4, 10);
        int output = cal.calculate(10, 10);
        System.out.println("The output is : " + output);
        Greeting gt1 = () -> System.out.println("Hello, from Lambda Expression.");
        gt1.greet();
        
    }
}
