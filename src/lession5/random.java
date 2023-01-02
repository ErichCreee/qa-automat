package lession5;

import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {


        Random random = new Random();
        int randomInteger = random.nextInt();
        int randomIntegerWithBound = random.nextInt(10);
        double randomDouble = random.nextDouble();

        System.out.println("randomInteger = " + randomInteger);
        System.out.println("randomIntegerWithBound = " + randomIntegerWithBound);
        System.out.println("randomDouble = " + randomDouble);
    }


}
