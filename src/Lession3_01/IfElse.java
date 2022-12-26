package Lession3_01;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Pleas enter your age");
        int age = input.nextInt();

        if (age > 18) {
            System.out.println("You're adult");

        } else if (age == 18) {
            System.out.println("You're are 18 years old");

        } else {
            System.out.println("You're young");
        }

    }
}
