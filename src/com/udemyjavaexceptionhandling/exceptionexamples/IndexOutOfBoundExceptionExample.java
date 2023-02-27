package com.udemyjavaexceptionhandling.exceptionexamples;

public class IndexOutOfBoundExceptionExample {
    public static void main(String[] args){
        int[] arr={2,3,4};
        try {
            System.out.println("the elements in the array are: ");
            for (int i = 0; i <= arr.length; i++) {             //i<=arr.length will throw an IndexOutOfBoundException
                System.out.println(arr[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("please check the condition because an exception occured :" +e);
        }
        System.out.println("after array..........");
    }
    void method1(){
        System.out.println("in method1");
    }
}
