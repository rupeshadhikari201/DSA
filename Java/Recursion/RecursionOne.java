package Recursion;

public class RecursionOne {

    public static void main(String[] args) {
            fact(3,1);
    }

    public static void fact(int n, int a){

        //base case
        if(n==0){
            return;
        }else{
            System.out.print(n + " ");
            fact((n-1), n*a);
            System.out.print(n +" ");
        }
    }
}
