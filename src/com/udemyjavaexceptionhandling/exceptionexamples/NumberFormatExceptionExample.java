package com.udemyjavaexceptionhandling.exceptionexamples;

    public class NumberFormatExceptionExample {
        public static void main(String[] args){
            String s="h";
            try {
                int a = Integer.parseInt(s);
            }catch(NumberFormatException e){
                System.out.println("An exception encounterred while assigning string to int as :" +e);
            }
            System.out.println("more code..........");
        }
    }


