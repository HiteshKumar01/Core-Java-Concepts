package com.udemypracticeoops.aggregation;

class Address{
    String city,state,country;
    public Address(String city,String state,String country){
        this.city=city;
        this.state=state;
        this.country=country;
    }
}
public class Employee {
    int id;
    String name;
    Address address;
    public Employee(int id,String name,Address address){
        this.id=id;
        this.name=name;
        this.address=address;
    }
    void display(){
        System.out.println("-----------------------------------------------");
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
        System.out.println("-----------------------------------------------");
    }

    public static void main(String[] args){
        Address address1=new Address("Noida","UP","India");
        Address address2=new Address("Agra","UP","India");

        Employee emp1=new Employee(101,"Hitesh",address1);
        Employee emp2=new Employee(102,"Ravi",address2);

        emp1.display();
        emp2.display();
    }
}
