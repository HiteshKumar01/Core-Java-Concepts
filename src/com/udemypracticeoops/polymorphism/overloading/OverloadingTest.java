package com.udemypracticeoops.polymorphism.overloading;
public class OverloadingTest {
     void sum(int a,int b){
        int sum=a+b;
         System.out.println("sum is "+sum);

     }
    void sum(float a,float b){
        float sum=a+b;
        System.out.println("sum is "+sum);
    }
    public static void main(String[] args){
        OverloadingTest ob=new OverloadingTest();
        ob.sum(10,20);
        ob.sum(10.23F,10.23F);
    }
}
