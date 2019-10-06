import java.util.Scanner;

public class PascalTriangle_011 {
    /*
   Java Program for Pascal Triangle
      Example:-input rows 5
             1
            1 1
           1 2 1
          1 3 3 1
         1 4 6 4 1
                */
    public static void main(String[] args) {

    int row,Empty,x,y,a=1;
        System.out.println("Input number of rows");
        Scanner scanner = new Scanner(System.in);
        row = scanner.nextInt();
        for (x=0;x<row;x++)
        {
            for(Empty=1;Empty<=row-x;Empty++)
                System.out.print("");
            for (y=0;y<=x;y++)
            {
                if (y==0|| x==0)
                    a=1;
                else a=a*(x-y+1)/y;
                System.out.print(""+a);
            }
            System.out.print("\n");
        }
    }
}
