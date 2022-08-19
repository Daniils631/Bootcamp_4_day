//Write a Java program to insert an element into the array list at the first position
import java.util.*;
public class Exercise3 {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<String>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("White");
        listString.add("Black");

        System.out.println(listString);

        // We can add new values in existing String array by giving him index and value
        listString.add(0,"Pink");
        listString.add(5,"Yellow");
        System.out.println(listString);

    }
}