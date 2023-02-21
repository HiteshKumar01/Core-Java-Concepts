package operatorsandassignments;

public class UnaryOperators {
    public static void main(String[] args){

        int a=10;
       // int b=1;
        //postfix
        System.out.println(a++);
        System.out.println(a--);
        //prefix
        System.out.println(++a);
        System.out.println(--a);
        System.out.println(+a);
        System.out.println(-a);

        System.out.println("-----------------");
        System.out.println("-----------------");

        int b=10;
        int c=20;
        System.out.println(b++ + c++);
        System.out.println(b-- + c--);
        System.out.println(++b + ++c);
        System.out.println(--b + --c);

        System.out.println(b++ + c++);
        System.out.println(b-- + c--);
        System.out.println(++b + ++c);
        System.out.println(--b + --c);

        System.out.println("-----------------");
        System.out.println("-----------------");
        int d=10;
        int e=-20;
        boolean f=true;
        boolean g=false;
        System.out.println(~d);
        System.out.println(~e);
        System.out.println(!f);
        System.out.println(!g);




    }
}
