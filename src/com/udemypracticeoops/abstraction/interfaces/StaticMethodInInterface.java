package com.udemypracticeoops.abstraction.interfaces;

interface StaticInterfaceExample{
    void hii();
    static void hello(int x){
        System.out.println(x+"="+ x*x*x);
    }
}
class Hello1 implements StaticInterfaceExample{
    @Override
    public void hii() {
        System.out.print("cube of ");
    }

}

public class StaticMethodInInterface {
    public static void main(String[] args){
        StaticInterfaceExample ob=new Hello1();
        ob.hii();
        StaticInterfaceExample.hello(10);


    }
}
