package operatorsandassignments;

public class ShiftOperators {
    public static void main(String[] args){

        int a=10;
          int b=2;
        //left shift operator
        System.out.println(a<<b);

        //right
        System.out.println(a>>b);

        //for positive numbers, both work the same
        System.out.println(10>>>2);
        System.out.println(10>>2);

        //for negative numbers, >>>changes parity bit(MSB) to 0
        System.out.println(-10>>>2);
        System.out.println(-10>>2);

            }
}
