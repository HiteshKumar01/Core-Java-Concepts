package com.udemypracticeoops.inheritance;

class A{
    void animal(){
        System.out.println("is animal");
    }
}
class B extends A{
    void dog(){
        System.out.println("Dog");
    }
}
public class SingleLevelInheritance {
    public static void main(String[] args){
        B ob=new B();
        ob.dog();
        ob.animal();
    }
}
