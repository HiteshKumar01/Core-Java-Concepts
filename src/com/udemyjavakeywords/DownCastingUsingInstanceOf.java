package com.udemyjavakeywords;

//downcasting using instanceof operator

//class Animal { }
//
//class Dog3 extends Animal {
//    static void method(Animal a) {
//        if(a instanceof Dog3){
//            Dog3 d=(Dog3)a;//downcasting
//            System.out.println("ok downcasting performed");
//        }
//    }
//
//    public static void main (String [] args) {
//        Animal a=new Dog3();
//        Dog3.method(a);
//    }
//
//}

//without using instanceof operator
class Animal { }
class Dog4 extends Animal {
    static void method(Animal a) {
        Dog4 d=(Dog4)a;//downcasting
        System.out.println("ok downcasting performed");
    }
    public static void main (String [] args) {
        Animal a=new Dog4();
        Dog4.method(a);
    }
}
