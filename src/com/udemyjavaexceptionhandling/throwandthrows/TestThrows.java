package com.udemyjavaexceptionhandling.throwandthrows;

public class TestThrows {
    public static int divide(int a,int b) throws ArithmeticException{
      int c=a/b;
      return c;
    }
    public static void main(String[] args){
        TestThrows ob=new TestThrows();

        try{
            System.out.println("division....." + ob.divide(10,0));

        }catch(ArithmeticException e){
            System.out.println("can not divide by 0");
        }
        System.out.println("rest of the code............");
    }
}
