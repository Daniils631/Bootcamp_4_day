//Write a Java program to empty an array list.

import java.util.*;

public class Exercise17 {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<String>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("White");
        listString.add("Black");

        System.out.println("Original list: " + listString);
        //Command allaowes to clone list
        listString.removeAll(listString);
        System.out.println("Changed array list: " + listString);

    }
}
