package com.udemypracticeoops.abstraction;
abstract class Bike{
    abstract void run();
}

public class Honda extends Bike {
    @Override
    void run() {
        System.out.println("running safely");
    }
    public static void main(String[] args){
        Bike ob=new Honda();
        ob.run();
    }
}
