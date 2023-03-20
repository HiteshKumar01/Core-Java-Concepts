package com.udemypracticeoops.inheritance;

class Aaa {
    void parentClass() {
        System.out.println("I am the Parent Class");
    }
}

class Bbb extends Aaa {
    void childClassOne() {
        System.out.println("I am child one");
    }
}

class Ccc extends Aaa {
    void childClassTwo() {
        System.out.println("I am child two");
    }
}

public class HierarichalInheritance {
    public static void main(String[] args) {
        Aaa ob = new Aaa();
        ob.parentClass();

        Ccc ob1 = new Ccc();
        ob1.childClassTwo();

        Bbb ob2 = new Bbb();
        ob2.childClassOne();

    }
}
