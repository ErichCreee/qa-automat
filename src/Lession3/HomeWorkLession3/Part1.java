package Lession3.HomeWorkLession3;

public class Part1 {public static void main(String[] args) {
//    Task 1
    int i5 = 5;
    int i2 = 11;

    double d1 = 5.5;
    double d2 = 1.3;

    long l = 20l;

    double result = 0;

    result = i2 / d1 + d2 %  i2 - l;
    System.out.println("Task 1");
    System.out.println("result = " + result);

//    Task 2
    int a = 5;
    int b = 8;
    int resultA = a-- - --a + ++a + a++;
    int resultB = ++b - b++ + ++b - --b;

    System.out.println("Task 1");
    System.out.println("resultA = " + resultA);
    System.out.println("resultB = " + resultB);
}
}
