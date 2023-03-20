package com.udemypractice.wrapperclasses;

public class PrimitiveAndObject {
    public static void main(String[] args){
        //primitive to object
        int x=100;
        Integer y=Integer.valueOf(x);
        System.out.println(y);

        //object to primitive
        int z=y.intValue();
        System.out.println(z);

        //another example
        float a=100.00f;
        Float b=Float.valueOf(a);
        System.out.println(b);

        int c=(int) b.floatValue();
        System.out.println(c);
    }
}
