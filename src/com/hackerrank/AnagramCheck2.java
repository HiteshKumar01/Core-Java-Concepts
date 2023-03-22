package com.hackerrank;

import java.util.Scanner;
//THIS IS THE CORRECT AND SHORTEST APPROACH

public class AnagramCheck2 {
static boolean isAnagram(String a, String b){
    int count = 0;
    if(a.length()==b.length())
    {
        a = a.toLowerCase();
        b = b.toLowerCase();
        char arr1[] = a.toCharArray();
        char arr2[] = b.toCharArray();
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);
        return java.util.Arrays.equals(arr1, arr2);
    }
    return false;
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
