package operatorsandassignments;

public class AssignmentOperator {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        a += 4;//a=a+4 (a=10+4)
//        b -= 4;//b=b-4 (b=20-4)
//        System.out.println(a);
//        System.out.println(b);


//        a+=3;//10+3
//        System.out.println(a);
//        a-=4;//13-4
//        System.out.println(a);
//        a*=2;//9*2
//        System.out.println(a);
//        a/=2;//18/2
//        System.out.println(a);

        //adding short
       short a=10;
       short b=10;
//a+=b;//a=a+b internally so fine
        a=(short)(a+b);//Compile time error because 10+10=20 now int
        System.out.println(a);
    }
}
