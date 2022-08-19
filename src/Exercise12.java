//Write a Java program to extract a portion of a array list.

import java.util.*;

public class Exercise12 {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<String>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("White");
        listString.add("Black");

        System.out.println("Original String\n" + listString);
        //this code extracts only choosed values;
        List<String> subList = listString.subList(0,3);
        System.out.println("List of first three elements:\n" + subList);
    }
}
