import java.util.Scanner;

public class NumberRhombusStructure_12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:  ");
        int n = in.nextInt();
        int count = 1;
        int nospaces = 1;
        int start = 0;

        for (int i = 1; i < (n * 2); i++) { //Row

            for (int spc = n - nospaces; spc > 0; spc--) { //Space
                System.out.print(" ");
            }


            //
            if (i < n) {
                start = i;          //for number
                nospaces++;    //for spaces
            } else {
                start = n * 2 - i;   //for number
                nospaces--;      //for space
            }
            for (int j = 0; j < count; j++) {   // Column

                System.out.print(start); //Print


                if (j < count / 2) {
                    start--;
                } else {
                    start++;
                }
            }
            if (i < n) {
                count = count + 2;
            } else {
                count = count - 2;
            }

            System.out.println();
        }
    }
}

