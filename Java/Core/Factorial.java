package CORE;
class Recursion {
   
    static long factorial(int num) {
        
        long result;

        if (num == 1) return 1;
        result = factorial(num - 1) * num;
        return result;
    }
    
} 
public class Factorial {

    public static void main(String[] args) {
        
        System.out.print("Factorial is : ");
        System.out.print(Recursion.factorial(5));
        
    }
    
}
