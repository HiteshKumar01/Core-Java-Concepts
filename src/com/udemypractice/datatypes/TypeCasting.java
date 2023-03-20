package com.udemypractice.datatypes;

public class TypeCasting {
    public static void main(String[] args) {
        //implicit
        byte a = 100;
        int b = a;
        System.out.println(b);

        char c = 'A';
        int d = c;
        System.out.println(d);

        //explicit
        int e = 100;
        byte f = (byte) e;
        System.out.println(f);

        int g = 100;
        char h = (char) g;
        System.out.println(h);

        //special cases while explicit casting
        int i=1000;
        byte j=(byte)i;             //1000=250*4 + 24 in clockwise direction
        System.out.println(j);      //will give -24

        int k=612;
        byte l=(byte)k;             //612=256*2 + 100
        char m=(char)l;             //d
        System.out.println(m);



    }
}
