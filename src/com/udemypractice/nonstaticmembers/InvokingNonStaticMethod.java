package com.udemypractice.nonstaticmembers;

public class InvokingNonStaticMethod {
    int num;

    InvokingNonStaticMethod(){
        System.out.println("in constructor");
    }
    static{
        System.out.println("in non static block");
    }
    public static void main(String[] args){
        System.out.println("in main method");
        InvokingNonStaticMethod obj=new InvokingNonStaticMethod();
        obj.doSomething();
    }
    void doSomething(){
        System.out.println("in non static method");
    }
}
