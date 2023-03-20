package com.udemypracticeoops.abstraction;

abstract class Shape{
    abstract void shape();
}
class Rectangle extends Shape{
    @Override
    void shape() {
        System.out.println("drawing rectangle");
    }
}
class Circle extends Shape{
    @Override
    void shape() {
        System.out.println("drawing circle");
    }
}
public class AbstractionExample {
    public static void main(String[] args){
        Shape ob=new Rectangle();
        Shape ob1=new Circle();
        ob.shape();
        ob1.shape();

    }
}
