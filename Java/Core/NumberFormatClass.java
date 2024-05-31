package CORE;
import java.text.NumberFormat;
// import java.util.Currency;
// import java.util.Locale;
import java.util.*;



/*  NumberFormat Class in JAVA
 * NumberFormat Class in java provides methods to format currency according to locale
 * getCurrencyInstance() method of NumberFormater Class returns instance of NumberFormater Class
 */
public class NumberFormatClass {

    public static void main(String[] args) {
        
        // NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
        // String currency = formatter.format(12324.134);
        // System.out.println(currency);
        // double payment = 12324.134;
        // NumberFormat n1 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        // String india = n1.format(payment);
        // System.out.println(india);

        // NumberFormat formater2 = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        // String ind = formater2.format(12324.134);
        // System.out.println(ind);

        // NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));

        //  String moneyString = formatter.format(12324.134);

        //  System.out.println(moneyString);
        // System.out.println(Currency.getInstance(new Locale("hi", "IN")).getSymbol());
         
        // Currency currency = Currency.getInstance("EUR");
        // String str = currency.getSymbol();
        // System.out.println(str);
        // create a currency for euro
        //   Currency curr = Currency.getInstance("EUR");

        //   String symbol = curr.getSymbol();
        //   System.out.println("Currency symbol is = " + symbol);


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount in double : ");
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat formater1 = NumberFormat.getCurrencyInstance(Locale.US);
        String us = formater1.format(payment);
        
        NumberFormat formater2 = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        String india = formater2.format(payment);
        
        NumberFormat formater3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = formater3.format(payment);
        
        NumberFormat formater4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = formater4.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

    }
    
}
