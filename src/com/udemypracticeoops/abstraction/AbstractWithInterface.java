package com.udemypracticeoops.abstraction;

interface A{
    void a();
    void b();
    void c();
    void d();
}
abstract class B implements A{
    public void c(){
        System.out.println("this is C");
    }
}
class C extends B{
    @Override
    public void a() {
        System.out.println("this is a");
    }

    @Override
    public void b() {
        System.out.println("this is b");
    }

    @Override
    public void d() {
        System.out.println("this is d");
    }
}
public class AbstractWithInterface {
    public static void main(String[] args){
        C ob=new C();
        ob.a();
        ob.b();
        ob.c();
        ob.d();
    }
}
