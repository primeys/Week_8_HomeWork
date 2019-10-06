import java.util.ArrayList;
import java.util.Scanner;

/*
Write a Java program to iterate through all elements in a array list.
 */

public class ArrayIterateAllElements_18 {
    public static void main(String[] args) {

        String y = "";
        ArrayList<String> array = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("  Enter   " + i + 1 + "  Any Name : ");
            y = scanner.next();
            array.add(i, y);
        }

        System.out.println(" :   Name List Stored In The Array  :");
           for (String x : array) {
            System.out.println(x);
        }
    }
}



