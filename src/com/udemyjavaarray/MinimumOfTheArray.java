package com.udemyjavaarray;
public class MinimumOfTheArray {
    static void min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (min > arr[i]) {
                min = arr[i];
            }
            }
        System.out.println(min);
        }
        public static void main(String[]args){
            //  MinimumOfTheArray ob=new MinimumOfTheArray();
            int[] a = {10, 23, 45, 23};
            min(a);
        }
    }

