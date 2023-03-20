package com.udemypractice.collections.vector;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector v=new Vector();
        System.out.println("Initial size and capacity--->");
        System.out.println("capacity- "+ v.capacity());
        System.out.println("size- " + v.size());

        Customer c1=new Customer("Hitesh",23, new Address("123","India","2891935"));
        Customer c2=new Customer("Ravi",22, new Address("124","India","24531935"));
        Customer c3=new Customer("Dheeraj",24, new Address("125","India","2421935"));
        Customer c4=new Customer("Sahil",23, new Address("5665","India","2895535"));
        Customer c5=new Customer("kumar",23, new Address("126","India","2834935"));
        Customer c6=new Customer("Parmar",23, new Address("126","India","2834935"));
        Customer c7=new Customer("Singh",23, new Address("126","India","2834935"));
        Customer c8=new Customer("Kashyap",23, new Address("126","India","2834935"));
        Customer c9=new Customer("Rana",23, new Address("126","India","2834935"));
        Customer c10=new Customer("Thakur",23, new Address("126","India","2834935"));
        Customer c11=new Customer("Sharma",23, new Address("126","India","2834935"));
        Customer c12=new Customer("Bhardwaj",23, new Address("126","India","2834935"));
        Customer c13=new Customer("Roni",23, new Address("126","India","2834935"));
        Customer c14=new Customer("Rahul",23, new Address("126","India","2834935"));
        Customer c15=new Customer("Hritik",23, new Address("126","India","2834935"));
        Customer c16=new Customer("Arun",23, new Address("126","India","2834935"));
        Customer c17=new Customer("Sanjay",23, new Address("126","India","2834935"));
        Customer c18=new Customer("Vishal",23, new Address("126","India","2834935"));

        v.add(c1);
        v.add(c2);
        v.add(c3);
        v.add(c4);
        v.add(c5);
        v.add(c6);
        v.add(c7);
        v.add(c8);
        v.add(c9);
        v.add(c10);
        v.add(c11);
        v.add(c12);
        v.add(c13);
        v.add(c14);
        v.add(c15);
        v.add(c16);
        v.add(c17);
        v.add(c18);

        for(int i=0;i<v.size();i++){
            System.out.println();
            System.out.println(v.get(i));
            System.out.println();
        }

    }
}
