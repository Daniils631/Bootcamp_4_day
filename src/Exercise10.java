//Write a Java program to shuffle elements in a array list.

import java.util.*;

public class Exercise10 {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<String>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("White");
        listString.add("Black");

        System.out.println("List before shuffling:\n" + listString);
        //this code shuffles array value randomly in different places;
        Collections.shuffle(listString);
        System.out.println("List after shuffling:\n" + listString);
    }
}
