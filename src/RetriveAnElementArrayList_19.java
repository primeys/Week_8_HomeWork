import java.util.ArrayList;

public class RetriveAnElementArrayList_19 {

    /*
    A Java program to retrieve an element (at a specified index) from a given
array list
     */

    public static void main(String[] args) {

        ArrayList<String> no = new ArrayList<>();

        no.add(0, "A");
        no.add(1, "B");
        no.add(2, "C");
        no.add(3, "D");
        no.add(4, "E");
        no.add(5, "F");
        no.add(6, "G");

        for (String re : no) {
            System.out.println(re);
        }

        System.out.println(" Retirive 1 and 4 from the list ");
        System.out.println(no.get(1));
        System.out.println(no.get(4));
    }
}


