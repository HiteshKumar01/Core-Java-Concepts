package com.udemypractice.flowcontrolstatements;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args){
        System.out.println("----------------------Find the roots of a Quadratic Equation---------------------");
        System.out.println("----------------------ax^2+bx+c=0----------------------");
        Scanner sc=new Scanner(System.in);

        System.out.print("enter a:");
        double a=sc.nextDouble();

        System.out.print("enter b:");
        double b=sc.nextDouble();

        System.out.print("enter c:");
        double c=sc.nextDouble();
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");

        System.out.println("the Equation entered is: " +a+ "x^2+" +b+ "x+" + c +"=0.0");
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");


        double result=b*b-4.0*a*c;  //to check whether roots exist or not

        if (result > 0.0) {
            double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);  //math.pow(a,b) where a is base and b is exponent
            double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
            System.out.println("The roots are: " + r1 + " and: " + r2);
        }else if(result==0.0){
            double r3= -b/(2.0*a);
            System.out.println("The root is: " +r3);
        }else{
            System.out.println("the equation does not have any real roots");
        }

    }
}
