package lession5;

import java.util.Random;

public class RandomValuesArrey {
    public static void main(String[] args) {
        Random random = new Random();
        int array[] = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "  ");


        }
    }
}
