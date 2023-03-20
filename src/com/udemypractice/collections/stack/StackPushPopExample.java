package com.udemypractice.collections.stack;

import java.util.*;

public class StackPushPopExample {
    public static void main(String[] args) {
        Stack<String> stk=new Stack<>();
        stk.push("11");
        stk.push("12");
        stk.push("13");
        stk.push("14");
        stk.push("15");
        stk.push("16");

        System.out.println(stk);

        stk.pop();
        stk.pop();

        System.out.println(stk);

        System.out.println(stk.peek());

        System.out.println(stk.empty());

//        System.out.println(stk.search(11));

        stk.push("hello");
        stk.push("world");
        stk.push("hiii");
        stk.push("nono");

        System.out.println(stk);
    }
}