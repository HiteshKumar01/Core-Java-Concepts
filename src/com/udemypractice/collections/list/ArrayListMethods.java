package com.udemypractice.collections.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {
    public static void main(String[] args) {


//        for (int i = 0; i <= 10; i++) {
//            list.add(i);
//
//        }
        System.out.println();
        System.out.println();
        System.out.println("=========================Welcome to the world of ArrayList===========================");
        System.out.println();
        System.out.println("=====================================================================================");
        System.out.println();
        //defining an ArrayList
        ArrayList<Integer> al=new ArrayList<>();

        //size
        System.out.println("initial size of list:- " + al.size());

        //add
        al.add(0,511);
        al.add(512);
        al.add(513);
        System.out.println(al);
        System.out.println("size after insertion- "+ al.size());
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println();
        //allAll() --> works with another collection
        ArrayList<Integer> al1=new ArrayList<>();
        al1.add(111);
        al1.add(112);
        al1.add(113);
        al1.add(114);
        System.out.println("2nd list - " + al1);
        al.addAll(3,al1);
        System.out.println("first list after using allAll() method- " + al);
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println();
        //remove all elements of a list
        ArrayList<Integer> al2=new ArrayList<>();
        al2.add(211);
        al2.add(212);
        al2.add(213);
        al2.addAll(3,al);
        System.out.println("removing elements from this list- " + al2);
        al2.clear();
        System.out.println("after removing all the elements list -" +al2);
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println();

        //copy a list
        System.out.println("we have a list- " + al1);
        System.out.println("copy of the list- "+ al1.clone());
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println();

        //check if an element is present or not in the list
        System.out.println("given list- "+ al1);
        System.out.println("checking if element '113' is present");
        System.out.println("is '113' present? " + al1.contains(113));
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println();

        //return element in the specified index
        System.out.println("checking an element on a specified index");
        System.out.println("we have " + al1.get(1) + " on 1st index");
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println();

        //return position/index of specified element
        System.out.println("checking the index of a specified element");
        System.out.println("we have "+ al1.indexOf(113) + "nd index with the element 113");
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println();

        //remove multiple elements
        System.out.println("we have a list -" + al1);
        al1.removeAll(al);
        System.out.println("after removing the elements, list becomes- " + al1);
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println();

        al1.add(11);
        al1.add(12);
        al1.add(13);
        al1.add(14);
        al1.add(15);
        al1.add(16);
        al1.add(17);
        for(int i=0;i<10;i++){
            al1.add(i);
        }
        System.out.println("checking whether the list is empty or not ");
        System.out.println("is the list empty? -" + al1.isEmpty());
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("return a sublist of the previous list");
        System.out.println("sublist of the list "+ al1 + " from index 2 to 6 is "+ al1.subList(2,6));
        System.out.println();
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("sorting the list in specified order---->");
        System.out.println("we have a list - " + al1);
        System.out.println("natural order of the sort() method -");
        Collections.sort(al1);
        System.out.println(al1);
        System.out.println("in descending order- ");
        Collections.sort(al1,Collections.reverseOrder());
        System.out.println(al1);
    }
}