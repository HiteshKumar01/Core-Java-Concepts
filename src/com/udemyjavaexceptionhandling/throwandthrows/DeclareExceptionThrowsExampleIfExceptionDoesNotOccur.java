package com.udemyjavaexceptionhandling.throwandthrows;

import java.io.IOException;

class M1 {
    void method()throws IOException{
        System.out.println("device operation performed");
    }
}
class DeclareExceptionThrowsExampleIfExceptionDoesNotOccur {
    public static void main(String[] args)throws IOException {//declare exception
        M1 m1 =new M1();
        m1.method();

        System.out.println("normal flow...");
    }
}
