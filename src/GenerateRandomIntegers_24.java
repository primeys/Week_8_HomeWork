import java.util.Random;

public class GenerateRandomIntegers_24 {

    /*
    Java Program to generate random integers in specific range
     */

    public static void main(String[] args) {

        System.out.println("generating integer number in range" + "(1-20)");

        for (int i = 0; i < 10; i++) {
            int Random = getRandomInrang(1, 20);
            System.out.print(Random + " ");
        }
        System.out.println();
    }

    private static int getRandomInrang(int min, int max) {

        Random no = new Random();
        return no.nextInt((max-min)+1)+min;
    }
}

