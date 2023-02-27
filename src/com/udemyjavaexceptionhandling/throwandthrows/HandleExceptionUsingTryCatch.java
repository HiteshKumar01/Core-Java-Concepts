package com.udemyjavaexceptionhandling.throwandthrows;

import java.io.*;
class M{
    void method()throws IOException{
        throw new IOException("device error");
    }
}
public class HandleExceptionUsingTryCatch{
    public static void main(String args[]){
        try{
            M1 m1 =new M1();
            m1.method();
        }catch(Exception e){System.out.println("exception handled");}

        System.out.println("normal flow...");
    }
}
