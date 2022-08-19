//Write a Java program to retrieve an element (at a specified index) from a given array list
import java.util.*;
public class Exercise4 {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<String>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("White");
        listString.add("Black");

        System.out.println(listString);
        // create new parametr element to store our captured value and then printed it
        String element = listString.get(0);
        System.out.println("First element: " + element);
        // we changed value of our element
        element = listString.get(2);
        System.out.println("Third element: " + element);

    }
}