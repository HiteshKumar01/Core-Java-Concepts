package com.stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiExample1 {
    public static void main(String[] args){
        List<Integer> list1=List.of(1,2,3,4,5,6,7,54,3,2,4,5,68);
        //find all even nos and print in a new list
        //old way
        System.out.println("old way");
        List<Integer> listEven=new ArrayList<>();
        for(Integer i:list1){
            if(i%2==0){
                listEven.add(i);
            }
        }
        System.out.println(list1);
        System.out.println(listEven);
        System.out.println("-----------------------");

        //new way
        System.out.println("new way using stream");
        Stream<Integer> stream=list1.stream();
        List<Integer> newList=stream.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newList);

        //another way
        System.out.println("other shorter way");
        List<Integer> newList1=list1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newList1);
        //nos greater than 10
        System.out.println("nos greater than 10");
        List<Integer> newList2=list1.stream().filter(i-> i>10).collect(Collectors.toList());
        System.out.println(newList2);

    }
}
