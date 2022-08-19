//Write a Java program to trim the capacity of an array list the current list size.

import java.util.*;

public class Exercise19 {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<String>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("White");
        listString.add("Black");

        System.out.println("Original list: " + listString);
        System.out.println("Let trim to size the above array: ");
        //Command allaows to minimaize array in storage
        ((ArrayList<String>) listString).trimToSize();
        System.out.println("Changed array list: " + listString);


    }
}
