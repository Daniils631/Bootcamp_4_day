//Write a Java program to test an array list is empty or not.

import java.util.*;

public class Exercise18 {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<String>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("White");
        listString.add("Black");

        System.out.println("Original list: " + listString);
        // command .isEmpy check if there any values in array
        System.out.println("Checking the above array list is empty or not! "+listString.isEmpty());
        //Command allaowes clean every valu from arry
        listString.removeAll(listString);
        System.out.println("Changed array list: " + listString);
        System.out.println("Checking the above array list is empty or not! "+listString.isEmpty());

    }
}
