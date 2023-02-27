package com.udemyjavaexceptionhandling.throwandthrows;

public class TestThrow {
    public static void isMajor(int age){
        if(age<18){
            throw new ArithmeticException("Person is not eligible to vote");
        }else{
            System.out.println("person is eligible to vote");
        }

    }
    public static void main(String[] args){
        isMajor(17);
        System.out.println("rest of the code.........");

    }
}
