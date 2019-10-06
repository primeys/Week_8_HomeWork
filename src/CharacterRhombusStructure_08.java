import java.util.Scanner;

public class CharacterRhombusStructure_08 {
    /*
    Q.8 A program to display the character rhombus structure.
    */
    public static void main(String[] args)
    {
        Structure();
    }
    public static void Structure()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value ");
        int x= scanner.nextInt();
        int coun1 = 1;
        int coun2 = 1;
        char ch= 'A';

        for (int i = 1; i <(x*2); i++)
        {
            for (int spc = x-coun2; spc >0; spc--)
            {
                System.out.print("");
            }
            if (i < x)
            {
                coun2++;
            }
            else
            {
                coun2--;
            }
            for (int j = 0; j < coun1; j++)
            {
                System.out.print(ch);
                if (j <coun1 /2)
                {
                    ch++;
                }
                else
                {
                    ch--;
                }
            } if (i < x){
                coun1 = coun1 +2;
            } else
            {
                coun1 = coun1-2;
            }
            ch = 'A';
            System.out.println();
        }
    }
}
