package com.udemyjavakeywords;


class A{
    void m1(){
        System.out.println("in m1");
    }
}
public class InstanceOfOperator extends A{
    public static void main(String[] args){
        A ob=new A();
        System.out.println(ob instanceof A); //true
        System.out.println(ob instanceof InstanceOfOperator); //false
    }

}
