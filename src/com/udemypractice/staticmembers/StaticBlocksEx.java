package com.udemypractice.staticmembers;

public class StaticBlocksEx {
    public static void main(String[] args){
        System.out.println("inside main");
    }
    static{
        System.out.println("inside static");
    }
    static{
        System.out.println("inside static 2");
    }
}
