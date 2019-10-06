import java.util.ArrayList;
import java.util.Collections;

public class ReverseElementArrayList_20 {
    /*
    A java Program to reverse elements in array list
     */

    public static void main(String[] args) {

        ArrayList<String> arry = new ArrayList<>();

        arry.add(0,"P");
        arry.add(1,"R");
        arry.add(2,"I");
        arry.add(3,"M");
        arry.add(4,"E");

        System.out.println(" Before the reversing of array:");
        System.out.println(arry);

        System.out.println("After Reversing of array");
        Collections.reverse(arry);  // Used Java inbuilt package "collections" to Reverse The Array
        System.out.println(arry);
    }
}

