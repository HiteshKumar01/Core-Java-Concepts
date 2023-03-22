package com.hackerrank;

import java.util.Scanner;

public class RegexPlay1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String ip=scan.nextLine().trim();

       String[] arr= ip.split("\\.");
//       for(String s:arr){
//           System.out.println(s);
//       }

//       for(int i=0;i<arr.length;i++){
           if(arr[0].matches("^([01][0-9][0-9]|2[0-4][0-9]|25[0-5])$") && arr[1].matches("^([01][0-9][0-9]|2[0-4][0-9]|25[0-5])$") && arr[2].matches("^([01][0-9][0-9]|2[0-4][0-9]|25[0-5])$") && arr[3].matches("^([01][0-9][0-9]|2[0-4][0-9]|25[0-5])$")){
               System.out.println("valid");
           }else{
               System.out.println("not valid");
           }
//       }
    }
}
