package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    static boolean isAnagram(String a, String b) {
        char[] arr1=a.toCharArray();
        char[] arr2= b.toCharArray();


        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);

    }

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String a = scan.next();
        String b=scan.next();
        scan.close();
        boolean ret=isAnagram(a,b);
        if(ret){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }

    }
}

