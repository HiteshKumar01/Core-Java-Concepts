package com.udemypractice.flowcontrolstatements;

import java.util.Scanner;

public class TwoFloatNumbersEqualTillThreePlacesAfterDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert 1st number: ");
        float f1 = sc.nextFloat();
        System.out.println("Insert 2nd number: ");
        float f2 = sc.nextFloat();

        String s1 = Float.toString(f1);
        String s2 = Float.toString(f2);

        String[] arr1 = s1.split("\\.");
        String[] arr2 = s2.split("\\.");
//        System.out.println(arr1[0]);
//        System.out.println(arr1[1]);
//        System.out.println(arr2[0]);
//        System.out.println(arr2[1]);
        String sub1 = arr1[0];
        String sub2 = arr2[1].substring(0, 3);
        String sub11 = arr1[1].substring(0, 3);
        String sub22 = arr2[0];

        if (sub1.equals(sub22)) {
            if (sub11.equals(sub2)){
                System.out.println("equal");
        }
        }else {
            System.out.println("different");
        }
    }
}

