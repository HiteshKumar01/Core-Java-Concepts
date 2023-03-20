package com.udemypractice.wrapperclasses;

public class ObjectAndStrings {
    public static void main(String[] args){
        //object to string
        long a=100;
        Long x=Long.valueOf(a);
        String s=x.toString();
        System.out.println(s);

        //string to object
        Long y=Long.valueOf(s);
        System.out.println(y);

    }
}
