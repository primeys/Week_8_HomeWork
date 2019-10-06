import java.util.Scanner;

public class Slove_RombusStructureForNumber {

    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value ");
        int x = 7;//scanner.nextInt();
        int coun1 = 1;
        int coun2 = 0;
        char val = '1';

        for (int i = 1; i < (x * 2); i++) {
            for (int spc = x - coun2; spc > 0; spc--) {
                System.out.print("");
            }
            if (i < x) {
                coun2++;
            } else {
                coun2--;
            }
            for (int j = 0; j < coun1; j++) {
                System.out.print(val);
                if (j < coun1 / 2) {
                    val++;
                } else {
                    val--;
                }
            }
            if (i < x) {
                coun1 = coun1 + 2;
            } else {
                coun1 = coun1 - 2;
            }
            val = '1';
            System.out.println();
        }
    }
}

