import java.util.AbstractList;
import java.util.ArrayList;

public class ArrayListIsEmptyOrNot_22 {
    /*
    A java Program to test an array list is empty or not?
     */

    public static void main(String[] args) {

        AbstractList<String> arry = new ArrayList<>();
        AbstractList<String> emptArry = new ArrayList<>();

        arry.add(0, "A");
        arry.add(1, "B");
        arry.add(2, "C");
        arry.add(3, "D");
        arry.add(4, "E");
        arry.add(5, "F");

        if (arry.isEmpty()) {
            System.out.println("First Array is Empty");
        } else {
            System.out.println("First Array is:");
            System.out.println(arry);
        }

        if (emptArry.isEmpty()) {
            System.out.println("Second Array is Empty");
        } else {
            System.out.println("Second Array is:");
            System.out.println(emptArry);
        }

    }

}



