//Write a Java program to join two array lists

import java.util.*;

public class Exercise15 {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<String>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("White");
        listString.add("Black");
        System.out.println("First array:\n" + listString);
        List<String> listString2 = new ArrayList<String>();
        listString2.add("Red");
        listString2.add("Green");
        listString2.add("White");
        listString2.add("Black");
        System.out.println("Second array:\n" + listString);

        // we create 3 array to save new value
        ArrayList<String> a = new ArrayList<String>();
        // we add in new arr 1 and 2 array
        a.addAll(listString);
        a.addAll(listString2);
        System.out.println("New array: \n" + a);

    }
}
