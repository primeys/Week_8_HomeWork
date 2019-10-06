import java.util.Arrays;

public class ReverseArrayInteValues_13 {
    /*
    A java program to reverse am array of integer values
     */

    public static void main(String[] args) {
        int y[] = {
                10, 23, 189, 45,
                19, 18, 68, 771, 60,
                14, 51, 39, 15};
        System.out.println(" Array Before the reverse: " + Arrays.toString(y));
        for (int i = 0; i < y.length / 2; i++) {
            int temp = y[i];
            y[i] = y[y.length - i - 1];
            y[y.length - i - 1] = temp;
        }


        System.out.println("Reverse Array is : " + Arrays.toString(y));
    }

}




