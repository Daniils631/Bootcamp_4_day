//Write a Java program to search an element in a array list.

import java.util.*;

public class Exercise7 {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<String>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("White");
        listString.add("Black");

        System.out.println(listString);
        // command set can rewrite value of any array element
        if (listString.contains("Red")){
            System.out.println("Found the element");
        }else {
            System.out.println("There is no such element");
        }

    }
}
