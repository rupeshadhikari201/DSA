package CORE;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class StaticBlock {

//Write your code here

static int H;
static int B;
static boolean flag;
static Scanner sc = new Scanner(System.in);

static{
    H = sc.nextInt();
    B = sc.nextInt(); 
    flag = H>0 && B>0;
}


public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
	}//end of main

}//end of class

    

