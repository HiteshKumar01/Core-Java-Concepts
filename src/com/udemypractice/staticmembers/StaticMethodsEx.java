package com.udemypractice.staticmembers;

public class StaticMethodsEx {
    public static void main(String[] args){
        System.out.println("inside main");
        StaticMethodsEx.m1();
    }
    static void m1(){
        System.out.println("inside static method");
    }
    static {
        System.out.println("inside static block");
        StaticMethodsEx.m1();
    }
}
