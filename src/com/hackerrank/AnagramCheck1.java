package com.hackerrank;

import java.util.Scanner;

public class AnagramCheck1 {

    static boolean isAnagram(String a, String b){
        if(a.length()==b.length()){
            a=a.toLowerCase();
            b=b.toLowerCase();
        }

        char[] chars=a.toCharArray();

        for(char c:chars){
            int index = b.indexOf(c);
            if (index != -1)
            {
//the substring() method returns a new string that is a substring of this string
//                b=b.toLowerCase();
                b = b.substring(0, index) + b.substring(index + 1, b.length());
            }
            else
            {
                return false;
            }
        }
        return b.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String a= scan.next();
        String b=scan.next();

        boolean ret=isAnagram(a,b);

        if(ret){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }
}
