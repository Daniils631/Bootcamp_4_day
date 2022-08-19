//Write a Java program of swap two elements in an array list

import java.util.*;

public class Exercise14 {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<String>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("White");
        listString.add("Black");

        System.out.println("Array list before swap:" );
        // we sort listString and print each element value
        for(String a: listString){
            System.out.println(a);
        }
        // this command helps swap two values between themseves
        Collections.swap(listString, 0, 2);
        System.out.println("Array list after swap:");
        // after swapping we sort listString and print each new element value
        for(String b: listString) {
            System.out.println(b);

        }
    }
}
