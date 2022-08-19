//Write a Java program to print all the elements of a ArrayList using the position of the elements

import java.util.*;

public class Exercise22 {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<String>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("White");
        listString.add("Black");

        System.out.println("Original list: " + listString);
        System.out.println("\nPrint using index of an element: ");

        int no_of_elements = listString.size();
        for (int index = 0; index < no_of_elements; index++)
            System.out.println(listString.get(index));


    }
}
