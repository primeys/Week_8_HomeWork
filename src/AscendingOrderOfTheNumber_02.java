import java.util.Scanner;

public class AscendingOrderOfTheNumber_02 {
    /*
    Q.2 Program for ascending order of the number
     */

    public static void main(String[] args)
    {
        AscendingNumber();
    }

public static void AscendingNumber()
{
    int num, tem;
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many number you want to stored in array?");
    num = scanner.nextInt();
    int a[]=new int[num];
    System.out.println("Enter all Number you wish to arrange");
    for (int i = 0; i <num; i++)
    {
        a[i]=scanner.nextInt();
    }
    for (int i = 0; i <num ; i++)
    {
        for (int j =i +1;j<num;j++)
        {
            if (a[i] >a[j])
            {
                tem = a[i];
                a[i] =a[j];
                a[j]=tem;
            }
        }
    }
    System.out.println("Number in Ascending Order:");
    for (int i = 0; i<num -1; i++)
    {
        System.out.print(a[i]+ ",");
    }
    System.out.println(a[num-1]);
}











}
