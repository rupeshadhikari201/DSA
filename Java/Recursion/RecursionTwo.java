package Recursion;

public class RecursionTwo {
    public static void main(String[] args) {

        int res = fun(5,2);
        System.out.println(res);
    }

    public static int fun(int x, int y){

        //base case
        if(x==0){
            return  y;
        }else {
            return fun(x-1, x+y);
        }
    }
}


/*
Here is the call stack:

fun1(5, 2)
    fun1(4, 7)
        fun1(3, 11)
            fun1(2, 14)
                fun1(1, 16)
                    fun1(0, 17)

 */