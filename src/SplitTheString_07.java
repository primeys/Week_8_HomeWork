public class SplitTheString_07 {
    /*
    A program to split the string
     */

    public static void main(String[] args)
    {
    String st1 = "Raj,Jazz,Jay,Hemant,Ketty";
    String[] stringSplit = st1.split(",");
        for (int i =0; i <stringSplit.length;i++)
        {
            System.out.println(stringSplit[i]);
        }
    }




}
