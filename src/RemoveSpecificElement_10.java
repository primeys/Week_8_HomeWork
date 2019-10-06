import java.util.Scanner;

public class RemoveSpecificElement_10 {
/*
Java Program to remove a specific element from an array
 */

    public static void main(String[] args)
    {
        RemoveElement();
    }
    public static void RemoveElement(){

        int i,n,pos;

        Scanner scanner = new Scanner(System.in);
        System.out.println(" How many number of elements to enter?");
        n = scanner.nextInt();
        int[] x = new int[n];

        System.out.println("Enter all Elements");
        for (i=0;i<n;i++)
        {
            x[i] = scanner.nextInt();
        }

        System.out.println("Enter the position of the number which you want to remove");
        pos = scanner.nextInt();
        for (i=pos;i<n-1;i++)
        {
            x[i]=x[i+1];
        } n = n-1;
        System.out.println(" After deleting array, New result is: ");
        for(i=0;i<n;i++)
        {
            System.out.println("a["+i+"]="+x[i]);
        }












    }

}


