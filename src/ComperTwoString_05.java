import java.util.Scanner;

public class ComperTwoString_05 {
    /*
    A program to compare two strings
     */
    public static void main(String[] args)
    {
        String x,y;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string");
        x = sc.nextLine();

        System.out.println("Enter second string");
        y = sc.nextLine();

        if (x.equalsIgnoreCase(y)) {
            System.out.println("Both Strings are same");
        } else {
            System.out.println(" Both Stings are not same");
        }
    }
}
