package operatorsandassignments;

public class RelationalOperatorsComparisonOperator {
    public static void main(String[] args) {
        int a = 200;
        int b = 20;
        if (a < b) {
            System.out.println("a is less then b");
        } else if (a == b) {
            System.out.println("a is equal to b");
        } else {
            System.out.println("b is less then a");
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

    }
}
