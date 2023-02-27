package com.udemyjavaexceptionhandling.exceptionexamples;

public class NullPointerExceptionExample {
    static IndexOutOfBoundExceptionExample a; //NullPointerException because we are not creating an object using new keyword, but only taking the reference
    public static void main(String[] args) {
        try {
            NullPointerExceptionExample.a.method1();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occured because instantiation not done using this class name constructor ");
            System.out.println("details:"+ e);
        }
    }
}
