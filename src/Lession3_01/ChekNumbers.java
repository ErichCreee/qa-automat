package Lession3_01;

import java.util.Scanner;

public class ChekNumbers {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number");
        number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number " + number + " - is even");
        } else {
            System.out.println("Number " + number + " - is odd");
        }

    }
}
