//Write a Java program to iterate through all elements in a array list
import java.util.*;
public class Exercise2 {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<String>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("White");
        listString.add("Black");

        // Foreach sorting parameter elements go tru every meaaning of listString value and prints it
        for(String element : listString) {
            System.out.println(element);
        }
    }
}
