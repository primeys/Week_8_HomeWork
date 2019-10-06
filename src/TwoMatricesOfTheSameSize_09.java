import java.util.Scanner;

public class TwoMatricesOfTheSameSize_09 {
    /*
    Java program to add Two Matrices of the same size.
     */
    public static void main(String[] args) {

        TwoMatricesOfTheSameSize_09 Add = new TwoMatricesOfTheSameSize_09();
        Add.TwoMatrixAdd();
    }

    public void TwoMatrixAdd() {
        int a, b, c, d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matrix");

        a = scanner.nextInt();
        b = scanner.nextInt();

        int first[][] = new int[a][b];
        int second[][] = new int[a][b];
        int sum[][] = new int[a][b];

        System.out.println("Enter the elements of for the first matrix") ;

        for (c = 0; c < a; c++)
            for (d = 0; d < b; d++)
                first[c][d] = scanner.nextInt();

        System.out.println("Enter the elements of the second matrix");

        for (c = 0; c < a; c++)
            for (d = 0; d < b; d++)
                second[c][d] = scanner.nextInt();

        for (c = 0; c < a; c++)
            for (d = 0; d < b; d++)
                sum[c][d] = first[c][d];

        System.out.println("Sum of the matrices");

        for (c = 0; c < a; c++) {
            for (d = 0; d < b; d++)
                System.out.print(sum[c][d] + "\t");
            System.out.println();
        }
    }
}
