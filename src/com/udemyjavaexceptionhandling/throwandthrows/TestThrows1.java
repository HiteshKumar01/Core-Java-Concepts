package com.udemyjavaexceptionhandling.throwandthrows;

import java.io.IOException;

public class TestThrows1 {
    void m() throws IOException {
        throw new IOException("Input output exception occured");
    }
    void n() throws IOException{
        m();
    }
    void p(){
        try {
            n();
        }catch(Exception e){
            System.out.println("Exception catched......");
        }
    }
    public static void main(String[] args){
        TestThrows1 ob=new TestThrows1();
        ob.p();
        System.out.println("more code.......");

    }
}
