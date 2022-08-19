//Write a Java program to get last modified time of a file.
import java.io.*;
import java.util.Date;

public class IOExercise7 {
    public static void main(String[] args) {

            File file = new File("/Users/danii/OneDrive/Desktop/bootcamp_2/4_day/New Text Document.txt");
            Date date=new Date(file.lastModified());
            System.out.println("\nThe file was last modified on: "+date+"\n");


    }
}
