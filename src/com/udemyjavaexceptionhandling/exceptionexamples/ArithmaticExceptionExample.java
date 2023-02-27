package com.udemyjavaexceptionhandling.exceptionexamples;

import java.util.Scanner;

public class ArithmaticExceptionExample {
    public static void main(String[] args){
        int a,b,c;
       try {
           System.out.println("enter two number to divide");
           Scanner sc = new Scanner(System.in);
           a = sc.nextInt();
           b = sc.nextInt();
           c = a / b;
           System.out.println("result: " + c);
       }catch(ArithmeticException e){
           System.out.println("please do not divide by zero because of exception: "+e);
       }
       System.out.println("more code........");
    }
}
