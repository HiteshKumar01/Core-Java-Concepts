package com.udemyjavaexceptionhandling.throwandthrows;
public class ThrowExample {
    public static void method(int a){
        if(a<1){
            throw new ArithmeticException("number is less than or equal to zero, can not find square");
        }else{
            System.out.println("square of a is: "+ a*a);
        }
    }
    public static void main(String[] args){
        ThrowExample ob=new ThrowExample();
        ob.method(-3);
        System.out.println("Rest of the code......");
    }

}
