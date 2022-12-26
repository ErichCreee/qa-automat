package Lession3_01;

public class Ternary {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 6;
        String result;

        /*if (a == b){
            result = "a and b equal";
            System.out.println("a and b equal");
                    }
        else {
            result = "a and b not equal";
                    }*/
        result = (a == b) ? "a and b equal" : "a and b not equal";
        System.out.println("result = " + result);

        result = (a == c) ? " a and c equal " : (a > c) ? " a greater c " : " c greater a ";
        System.out.println(" result  = " + result);

    }

}
