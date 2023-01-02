package lession5;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class random {
    public static void main(String[] args) {

        Random random = new Random();
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();

       /* int randomInteger = random.nextInt();
        int randomIntegerWithBound = random.nextInt(10);
        double randomDouble = random.nextDouble();

        System.out.println("randomInteger = " + randomInteger);
        System.out.println("randomIntegerWithBound = " + randomIntegerWithBound);
        System.out.println("randomDouble = " + randomDouble);*/

        int randomIntegerWithBound = threadLocalRandom.nextInt(10, 20);
        System.out.println("randomIntegerWithBound = " + randomIntegerWithBound);

    }

}

