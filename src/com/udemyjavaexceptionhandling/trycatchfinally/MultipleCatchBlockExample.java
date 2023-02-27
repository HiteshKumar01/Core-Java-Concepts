package com.udemyjavaexceptionhandling.trycatchfinally;

import java.util.Scanner;

public class MultipleCatchBlockExample {
   //static int a,b;

    public static void main(String[] args){
        try {
        int a[]=new int[5];
        a[5]=30/0;
        }catch (ArithmeticException e){
            System.out.println("can not divide by zero");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array size exceeded");
        }catch(Exception e){
            System.out.println("Parent Exception occured");
        }
        System.out.println("outside the code.........");
    }
}
