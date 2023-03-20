package com.udemypractice.commandlinearguement;

public class ProductOfTwoNumbers {
    public static void main(String[] args){
        long a=Long.parseLong(args[0]);
        long b=Long.parseLong(args[1]);

        long result=a*b;
        System.out.println("Product of two numbers is: "+result);
    }
}
