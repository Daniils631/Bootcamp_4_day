//Write a Java program to compare two array lists

import java.util.*;

public class Exercise13 {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<String>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("White");
        listString.add("Black");
        System.out.println("First String:\n" + listString);
        List<String> listString2 = new ArrayList<String>();
        listString2.add("Red");
        listString2.add("Green");
        listString2.add("White");
        listString2.add("Black");
        System.out.println("Second String:\n" + listString);

        //we create 3 list to store the value of meaning if they are the same
        List<String> listString3 = new ArrayList<String>();
        // we sort value String e from first array
            for (String e :listString) {
                // Here we ar comparing 2 array with first and ading to 2 list
                listString3.add(listString2.contains(e) ? "Yes" : "No");
            }
                System.out.println("Result:\n" + listString3);

    }
}
