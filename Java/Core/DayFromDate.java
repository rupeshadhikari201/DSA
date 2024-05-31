package CORE;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.Map;

class Result {

    int jan = 1;
    int feb = 4;
    int mar = 4;
    int apr = 0;
    int may = 2;
    int jun = 5;
    int jul = 0;
    int aug = 3;
    int sep = 6;
    int oct = 1;
    int nov = 4;
    int dec = 6;
    

    public String dayFromDatefunc(int year, int month, int day) {

       

        int res = year % 100; //? step 01
        int store = res;
        res = res % 4;                  //? step 02
        res = res + day;                //? step 03
        res = res + aug;                //? step 04

        int code = 0;
        System.out.println(year);
        if (year <= 1700 || year >= 2099) {
            System.out.println(year);
            if (year <= 1700) {
                while (year >= 1700 || year <= 2099) {
                    year = year + 400;
                }
                System.out.println(year + "smalelr than 1700"); 
            }
            if (year >= 2099) {
                while (year >= 1700 || year <= 2099) {
                    year = year - 400;
                }
                System.out.println(year+ "greater than 2099"); 
            }
            
        } else {
            System.out.println(year+ " In else");
            if (year >= 1700 && year < 1799) {
                code = 4;
            }
            if (year >= 1800 && year < 1899) {
                code = 2;
            }
            if (year >= 1900 && year < 1999) {
                code = 0;
            }
            if (year >= 2000 && year < 2099) {
                code = 6;
            }
        }

        res = res + code;
        res = res + store;
        res = res % 7;

        switch (res) {

            case 1:
                return "SUNDAY";

            case 2:
                return "MONDAY";
                
            case 3:
                return "TUESDAY";
               
            case 4:
                return "WEDNUSDAY";
                
            case 5:
                return "THURSDAY";
               
            case 6:
                return "FRIDAY";
                
            case 7:
                return "SATURDAY";
                

            default:
                return "NOt Valid";
                
            
        }
        
       
    }
    
    
    
}
class DayFromDate {


    public static void main(String[] args) {
        
        Result r = new Result();
        String day = r.dayFromDatefunc(2582, 11, 19);
        System.out.println(day);
        String day2 = r.dayFromDatefunc(2023, 1, 27);
        System.out.println(day2);
    }
    
}
