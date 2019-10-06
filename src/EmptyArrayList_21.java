import java.util.ArrayList;

public class EmptyArrayList_21 {
    /*
    A java Program to empty an array list
     */

    public static void main(String[] args) {

        ArrayList<String> emptyArray = new ArrayList<>();

        emptyArray.add(0, "A");
        emptyArray.add(1, "B");
        emptyArray.add(2, "C");
        emptyArray.add(3, "D");
        emptyArray.add(6, "E");
        emptyArray.add(5,"F");

        System.out.println("All Array :");
        System.out.println(emptyArray);

        System.out.println("----------: Empty Array :----------");
        emptyArray.removeAll(emptyArray);
        //Remove All Array java inbuilt collection Method

        System.out.println(emptyArray);
    }
}



