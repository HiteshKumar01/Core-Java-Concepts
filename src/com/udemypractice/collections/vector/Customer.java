package com.udemypractice.collections.vector;

public class Customer {
    String name;
    int age;
    Address address;

    Customer(String name, int age, Address address){
        this.name=name;
        this.age=age;
        this.address=address;
    }

    public String toString(){
        return (
                        "Name    : "     +name+
                        "\nage     : "     +age+
                        "\nhno     : "     + address.hno+
                                "\ncountry : "    +address.country+
                                "\nph      : "       +address.ph
                );
    }
}
