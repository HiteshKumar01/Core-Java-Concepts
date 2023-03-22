package com.hackerrank;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexPlay {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0 && in.hasNextLine()){
            String pattern = in.nextLine();
            //Write your code

            try{
                Pattern p = Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch(PatternSyntaxException e){
                System.out.println("Invalid");
            }
        }
        in.close();

    }
}
