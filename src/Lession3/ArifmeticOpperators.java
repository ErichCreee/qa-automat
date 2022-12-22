package Lession3;

public class ArifmeticOpperators {
    public static void main(String[] args) {
        int a = 20;
        int b = 7;

        double c = 20;
        double d = 7;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
// " % - это остаток от деления, то есть целое число, оставшееся от ближайшего целого"
        System.out.println("c / d = " + (c / d));
        System.out.println("c % d = " + (c % d));

        int resultOfInt = a * b;
//        int resultOfDouble = a * c - not valide
        double resultOfDouble = c / b;
        System.out.println("resultOfDouble = " + resultOfDouble);

//        System.out.println("a / 0" + (a / 0)); - not valide
//        System.out.println("c / 0" + (c / 0)); - result tends to infinity
    }
}
