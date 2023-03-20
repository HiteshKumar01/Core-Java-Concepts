package com.udemypractice.flowcontrolstatements;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args){
        //input from user
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();

        if(input>0){
            System.out.println(input +" is positive");
        }else if(input<0){
            System.out.println(input +" is negative");
        }else{
            System.out.println("you entered0 zero");
        }
    }
}
