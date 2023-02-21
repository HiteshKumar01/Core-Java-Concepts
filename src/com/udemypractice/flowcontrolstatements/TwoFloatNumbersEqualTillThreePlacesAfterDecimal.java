package flowcontrolstatements;

import java.util.Scanner;

public class TwoFloatNumbersEqualTillThreePlacesAfterDecimal {
    public static void main(String[] args) {

//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter first number: ");
//        double a=sc.nextDouble();
//        System.out.println("enter second number: ");
//        double b=sc.nextDouble();
//
//        a=Math.round(a*1000);
//        a=a/1000;
//
//        b=Math.round(b*1000);
//        b=b/1000;
//
//        if(a==b){
//            System.out.println("the two entered numbers have same decimal numbers till three places");
//        }else{
//            System.out.println("not equal");
//        }
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

        String sub11=arr1[1].substring(0,3);
        System.out.println(sub11);
        String sub22=arr2[1].substring(0,3);
        System.out.println(sub22);

        if(sub11.equals(sub22)){
            System.out.println("equal");
        }else{
            System.out.println("different");
        }


    }


//        String sub1=s1.substring(0,6);
//        String sub2=s2.substring(0,6);
//        if(sub1.equals(sub2)){
//            System.out.println("same");
//        }else{
//            System.out.println("different");
//        }

//        DecimalFormat df = new DecimalFormat();
//        String s1 = df.format(f1);
//        String s2 = df.format(f2);

//        float c1 = Float.parseFloat(s1);
//        float c2 = Float.parseFloat(s2);
//
//        if(c1 == c2){
//            System.out.println("Numbers " + c1 + " & " + c2 + " are same!");
//        } else {
//            System.out.println("Numbers are different!");
//        }

  }

