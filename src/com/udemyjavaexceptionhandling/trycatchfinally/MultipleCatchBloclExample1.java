package com.udemyjavaexceptionhandling.trycatchfinally;

public class MultipleCatchBloclExample1 {
    //I have not defined any scenario for NullPointerException, therefore, the Parent Exception block will be executed

        public static void main(String[] args) {

            try{
                String s=null;
                System.out.println(s.length());
            }
            catch(ArithmeticException e)
            {
                System.out.println("Arithmetic Exception occurs");
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("ArrayIndexOutOfBounds Exception occurs");
            }
            catch(Exception e)
            {
                System.out.println("Parent Exception occurs");
            }
            System.out.println("rest of the code");
        }
    }

