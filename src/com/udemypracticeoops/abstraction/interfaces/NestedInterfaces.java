package com.udemypracticeoops.abstraction.interfaces;

interface InterfaceOne{
    interface InterfaceTwo{
        void run();
    }
}
class MyClass implements InterfaceOne.InterfaceTwo{
    @Override
    public void run() {
        System.out.println("running");
    }
}
public class NestedInterfaces {
    public static void main(String[] args){
        InterfaceOne.InterfaceTwo ob=new MyClass();
        ob.run();
    }
}
