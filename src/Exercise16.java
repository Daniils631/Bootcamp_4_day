//Write a Java program to clone an array list to another array list

import java.util.*;

public class Exercise16 {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<String>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("White");
        listString.add("Black");

        System.out.println("Original list: " + listString);
        //Command allaowes to clone list
        ArrayList<String> listString2 = (ArrayList<String>) ((ArrayList<String>) listString).clone();
        System.out.println("Cloned array list: " + listString2);

    }
}
