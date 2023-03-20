package com.stream_api;

import java.util.List;
import java.util.stream.Collectors;

public class MapAndFilterExample {
    public static void main(String[] args) {
        //using filter method
        List<String> names=List.of("Hello","world","HI","himachal");
        List<String> newNames= names.stream().filter(
                e->e.startsWith("H")).
                collect(Collectors.toList());

        System.out.println(newNames);

        //using map method
        List<Integer> list=List.of(24,675,234,786,352,756,234,14,5437,35,67,24,254,36,245,322);
        List<Integer> newList= list.stream().map(
                i->i*i).
                collect(Collectors.toList());
        System.out.println(newList);

       Integer newList1= list.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println("max-" + newList1);

        Integer newList2=list.stream().min((x,y) -> x.compareTo(y)).get();
        System.out.println("min-" + newList2);

       List<Integer> newList3= list.stream().sorted().collect(Collectors.toList());
        System.out.println("sorted elements- "+newList3);


    }
}
