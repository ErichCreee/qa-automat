package lession5;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MaxGrade {
    public static void main(String[] args) {
        Random random = new Random();
        String names[] = {"Irina", "Roman", "Karina", "Olga", "Gleb"} ;
        int grades[] = new int[5];
        int maxGrades = grades[0];
        int index = 0;

        for (int i = 0; i < grades.length; i++) {
            grades[i] = random.nextInt(100);
        }
        for (int i = 0; i < grades.length; i++) {
            System.out.println(names[i] + " - " + grades[i]);
        }
        for (int i = 1 ; i < grades.length; i++) {
            if ( grades[i] > maxGrades){
                maxGrades = grades[i];
                index = i;
            }
        }

        System.out.println("The best student is " + names[index] + " with grade " + grades[index]);
    }
}
