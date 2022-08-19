//Write a Java program to increase the size of an array list.

import java.util.*;

public class Exercise20 {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<String>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        System.out.println("Original list: " + listString);
        ((ArrayList<String>) listString).ensureCapacity(6);
        listString.add("White");
        listString.add("Pink");
        listString.add("Black");
        System.out.println("Changed array list: " + listString);


    }
}
