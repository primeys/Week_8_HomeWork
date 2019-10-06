import java.util.Scanner;

public class ReverseTheString_06 {
    /*
    A program to reverse the string
     */

    public static void main(String[] args) {
        System.out.println("Enter string to reverse it");
        Scanner scanner = new Scanner(System.in);
        String stor = scanner.nextLine();
        String reverse = "";

        for (int i = stor.length()-1; i>=0;i--) {
            reverse = reverse + stor.charAt(i);
        }
        System.out.println("Reverses string is:");
        System.out.println(reverse);
        }
    }

