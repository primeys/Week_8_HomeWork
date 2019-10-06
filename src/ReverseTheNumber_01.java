import java.util.Scanner;

public class ReverseTheNumber_01 {
    //Program to reverse the given number

    public static void main(String[] args)
    {
        ReverseNumber();
    }
public static void ReverseNumber()
{
    int num, rev =0;
    System.out.println(" Enter the  digit to reverse:");
    Scanner dig = new Scanner(System.in);
    num = dig.nextInt();
    while (num !=0)
    {
        rev = rev *10;
        rev =rev + num %10;
        num = num / 10;
    }
    System.out.println("Reverse Digit is : " + rev);
}
}
