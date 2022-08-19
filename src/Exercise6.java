//Write a Java program to remove the third element from a array list

import java.util.*;

public class Exercise6 {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<String>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("White");
        listString.add("Black");

        System.out.println(listString);
        // command set can rewrite value of any array element
        listString.remove(2);
        System.out.println("After removing third element from the list:\n"+listString);

    }
}
