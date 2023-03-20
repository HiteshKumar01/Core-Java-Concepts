package com.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObjectExample {
    public static void main(String[] args) {
        //blank stream
        Stream<Object> emptyStream=Stream.empty();
        emptyStream.forEach(e-> {
            System.out.println(e);
        });
        System.out.println();

        //array,object or collection
        String[] names={"a","b","c","d"};
        Stream<String> stream1= Stream.of(names);
        stream1.forEach(e->{
            System.out.println(e);
        });
        System.out.println();
        //builder pattern
        Stream<Object> streamBuilder=Stream.builder().build();
        streamBuilder.forEach(e->{
            System.out.println(e);
        });
        System.out.println();
        //Arrays
        IntStream stream2=Arrays.stream(new int[]{1,2,3,4,5,6});
        stream2.forEach(e->{
            System.out.println(e);
        });
        System.out.println();
        //Collection object(list,set etc)
        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        Stream<Integer> stream3= list1.stream();
        stream3.forEach(e->{
            System.out.println(e);
        });
    }
}