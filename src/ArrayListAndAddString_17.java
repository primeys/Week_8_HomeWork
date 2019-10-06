import java.util.ArrayList;
/*
A Java program to create a new array list, add some colours (string) and
printout the collection.
 */


public class ArrayListAndAddString_17 {

    public static void main(String[] args) {

        ArrayList<String> colour = new ArrayList<>();

        String colour1[] = {"Red", "White", "Blue", "Purple"};

        colour.add(0, "Blue");
        colour.add(1, "Grey");
        colour.add(2, "Pink");
        colour.add(3, "Black");

        for (String s : colour) {
            System.out.println(s);
        }
    }

}

