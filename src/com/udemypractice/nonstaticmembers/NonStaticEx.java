package com.udemypractice.nonstaticmembers;

public class NonStaticEx {
    int num;//non static variable

    NonStaticEx(){               //constructor
        System.out.println("inside constructor");
    }
    {                                //non static block
        System.out.println("inside non static block");
    }
    public static void main(String[] args){
        System.out.println("inside main");
        new NonStaticEx();
    }
}
