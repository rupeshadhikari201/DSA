package Recursion;

public class RecursionThree {

    public static void main(String[] args) {

        System.out.println(fun(4));
    }

    public  static int fun(int n){

        //base
        if(n==1){
            return 0;
        }

        return  1 + fun(n/2);
    }
}

/*
Here is the call stack

fun1(4)
    fun1(2)
        fun1(1)

*/
