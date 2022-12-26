package Lession3.HomeWorkLession3;

public class Part2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 12;
        int z = 3;

        double result1 = 0;
        result1 = x += y - x++ * z;
        System.out.println("Operation 1");
        System.out.println("result1 = " + result1);

        double result2 = 0;
        result2 = z = --x -y * 5;
        System.out.println("Operation 2");
        System.out.println("result2 = " + result2);

        double result3 = 0;
        result3 = y /=x + 5 % z;
        System.out.println("Operation 3");
        System.out.println("result3 = " + result3);

        double result4 = 0;
        result4 = z = x++ + y * 5;
        System.out.println("Operation 4");
        System.out.println("result4 = " + result4);

        double result5 = 0;
        result5 = x = y - x++ * z;
        System.out.println("Operation 5");
        System.out.println("result5 = " + result5);
    }
}
