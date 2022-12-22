package Lession3;

import java.util.Locale;
import java.util.Scanner;

public class UserInPut {
    public static void main(String[] args) {
        String name;
        int age;
        double grade;

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
// 'выделить мышкой+ctrl+shift+/ - это блочный комментарий, "ctrl+/"- это строчный комментарий'
/*        System.out.println("Pleas enter your name:");
        name = input.nextLine();
        System.out.println("Pleas enter your age:");
        age = input.nextInt();*/

        System.out.println("Pleas enter your grade:");
        grade = input.nextDouble();

 /*       System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("grade = " + grade);
        System.out.println("Finished");*/
    }
}
