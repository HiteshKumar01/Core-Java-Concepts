package com.udemypracticeoops.polymorphism.overloading;

public class OverloadingExample {
    void run(int a,int b){
        int sum=a+b;
        System.out.println("sum of two numbers is "+sum);
    }
    void run(int a,int b,int c){
        int sum=a+b+c;
        System.out.println("sum of three numbers is "+sum);
    }
    public static void main(String[] args){
        OverloadingExample ob=new OverloadingExample();
        ob.run(1,2);
        ob.run(3,4,5);
    }
}
