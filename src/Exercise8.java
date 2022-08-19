//Write a Java program to sort a given array list.

import java.util.*;

public class Exercise8 {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<String>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("White");
        listString.add("Black");

            System.out.println("List before sort" + listString);
            //this code helps to sort array by alphabetical order;
            Collections.sort(listString);
        System.out.println("List after sort" + listString);
    }
}
