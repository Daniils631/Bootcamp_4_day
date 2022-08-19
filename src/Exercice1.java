//Write a Java program to create a new array list, add some colors (string) and print out the collection.
import java.util.*;
public class Exercice1 {
    public static void main(String[] args) {
        // Created String array
        List<String> listString = new ArrayList<String>();
        // added information to String
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("White");
        listString.add("Black");
        System.out.println(listString);
    }
}
