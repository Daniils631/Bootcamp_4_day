//Write a Java program to shuffle elements in a array list.

import java.util.*;

public class Exercise11 {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<String>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("White");
        listString.add("Black");

        System.out.println("List before reversing:\n" + listString);
        //this code reverses array value;
        Collections.reverse(listString);
        System.out.println("List after reversing:\n" + listString);
    }
}
