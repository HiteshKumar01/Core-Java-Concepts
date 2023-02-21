package flowcontrolstatements;

import java.util.Scanner;

public class GreatestOfThreeNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("enter first number: ");
        int a=sc.nextInt();
        System.out.print("enter second number: ");
        int b=sc.nextInt();
        System.out.print("enter first number: ");
        int c=sc.nextInt();
        System.out.println("-----------------------------------------------");
        System.out.println("-----------------------------------------------");

        if(a>b&a>c){
            System.out.println(a+ " is greatest among three");
        }else if (b>a&b>c){
            System.out.println(b+ " is greatest among three");
        }else{
            System.out.println(c+ " is greatest among three");
        }
    }
}
