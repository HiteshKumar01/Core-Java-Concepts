package collections.list;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            list.add(i);

        }
        System.out.println("Collections.Collections.list: " + list);

        list.add(2,105);
        System.out.println("Collections.Collections.list after replacement at index=2: " + list);

        list.set(3,200);
        System.out.println("Collections.Collections.list after updating at index=3:" + list);

        System.out.println("------------------------------------------------");

        ArrayList<Integer> secondList=new ArrayList<>();
        secondList.add(111);
        secondList.add(222);
        secondList.add(333);
        System.out.println("second Collections.Collections.list:" + secondList);

        System.out.println("-----------------------------------------------------");

        list.addAll(4,secondList);
        System.out.println("first Collections.Collections.list after inserting secondList into it:" + list);

        //search for an element in the Collections.Collections.list
        System.out.println("-----------------------------------------------------");
        System.out.println("searching for an element in the Collections.Collections.list");
        if(list.contains(111)){
            System.out.println("Collections.Collections.list has the element");
        }
        else{
            System.out.println("Collections.Collections.list does not have the element");
        }

        //printing Collections.Collections.list
        System.out.println("-----------------------------------------------------");
        System.out.println("printing the Collections.Collections.list:");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //remove an element
        System.out.println("-----------------------------------------------------");
        System.out.println("removing element at index=3:");
        list.remove(3);
        System.out.println("Collections.Collections.list after removal:" +list);
    }
}