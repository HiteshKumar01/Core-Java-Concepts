package com.udemyjavaexceptionhandling.throwandthrows;

// Class that uses above MyException
    public class UserDefinedException extends Throwable {


    public static void main(String[] args)
        {
            try
            {
                // throw an object of user defined exception
                throw new TestThrow3("This is user-defined exception");
            }
            catch (TestThrow3 ude)
            {
                System.out.println("Caught the exception");
                // Print the message from MyException object
                System.out.println(ude.getMessage());
            }
        }
    }

