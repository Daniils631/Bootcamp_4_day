import java.util.*;

//Write a Java program to update specific array element by given element.
public class Exercise5 {
    public static void main(String[] args) {
        List<String> listString = new ArrayList<String>();
        listString.add("Red");
        listString.add("Green");
        listString.add("Orange");
        listString.add("White");
        listString.add("Black");

        System.out.println(listString);
        // command set can rewrite value of any array element
        listString.set(2, "Yellow");
        System.out.println(listString);

    }
}
