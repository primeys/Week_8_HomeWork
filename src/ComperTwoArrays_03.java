import java.util.Arrays;

public class ComperTwoArrays_03 {
    /*
     A program to compare two array
    and its elements are same or not?
     */

    public static void main(String[] args)
    {

        int ar1[]={2,5,8,3};
        int ar2[]={5,2,1,8};

        if (compareTwoArray(ar1,ar2))
            System.out.println("Array 1 and 2 is same");
        else
            System.out.println("Array 1 and 2 is not same");

     //   compareTwoArray();
    }
    public static boolean compareTwoArray(int ar1[], int ar2[])
    {
        int n1 = ar1.length;
        int n2 = ar2.length;
        if( n1 != n2)
            return false;
        Arrays.sort(ar1);
        Arrays.sort(ar2);

        for (int i =0;i<n1;i++)
            if (ar1[i] != ar2[i])
                return false;

            return true;
    }

}
