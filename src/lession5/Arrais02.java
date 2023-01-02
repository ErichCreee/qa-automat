package lession5;

public class Arrais02 {
    public static void main(String[] args) {

        int arrayOfNumbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.print(arrayOfNumbers[i] + " ");
        }
        for (int number : arrayOfNumbers) {
            System.out.print(number + " ");
        }
    }
}
