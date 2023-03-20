package com.udemypracticeoops.abstraction.interfaces;

public interface InterfaceExample {
     void run();
     void walk();
     void swim();
     void hello();

    }
    class Hello implements InterfaceExample{

        @Override
        public void run() {
            System.out.println("running....");
        }

        @Override
        public void walk() {
            System.out.println("walking.....");
        }

        @Override
        public void swim() {
            System.out.println("swimming.........");
        }

        @Override
        public void hello() {
            System.out.println("saying hello........");
        }

        public static void main(String[] args){
            InterfaceExample ob=new Hello();
            ob.run();
            ob.walk();
            ob.swim();
            ob.hello();
        }
    }



