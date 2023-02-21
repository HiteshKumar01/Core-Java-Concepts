package com.udemypracticeoops.abstraction.interfaces;

interface A{
    void print();
}
interface B{
    void print();
}

public class MultipleInheritanceUsingInterfaces implements A,B {
    @Override
    public void print() {
        System.out.println("no ambiguity because the method implementation is defined in the class implementing the two Interfaces........Hence no ambiguity");
    }
    public static void main(String[] args){
        MultipleInheritanceUsingInterfaces ob=new MultipleInheritanceUsingInterfaces();
        ob.print();
    }
}
