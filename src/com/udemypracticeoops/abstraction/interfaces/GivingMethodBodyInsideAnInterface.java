package com.udemypracticeoops.abstraction.interfaces;

interface Hii{
    void m1();
    default void m2(){
        System.out.println("in method m2");
    }

}
class UsingDefault implements Hii{
    @Override
    public void m1() {
        System.out.println("in method m1");
    }

    @Override
    public void m2() {
        Hii.super.m2();
    }
}
public class GivingMethodBodyInsideAnInterface {
    public static void main(String[] args){
        UsingDefault ob=new UsingDefault();
        ob.m1();
        ob.m2();
    }
}
