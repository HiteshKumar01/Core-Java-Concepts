package com.udemypractice.flowcontrolstatements;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a year :");
        int year=sc.nextInt();

        if(year%400==0 || ((year%4==0)&&(year%100!=0))){
            System.out.println(year + " is leap");
        }else{
            System.out.println(year + " is not leap");
        }


    }
}
