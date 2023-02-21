package packageB;

import packageA.A;

public class C extends A {
    public static void main(String[] args){
        A aObject=new A();
        System.out.println(aObject.d);

        C cObject=new C();
        System.out.println(cObject.c); //protected c can only be accessed here using the object of C class
        System.out.println(aObject.d);
    }
}
