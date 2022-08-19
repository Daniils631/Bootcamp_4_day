//Write a Java program to append text to an existing file.

import java.io.*;
import java.util.*;

public class IOExercise16 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try {
            String filename = "/Users/danii/OneDrive/Desktop/bootcamp_2/4_day/New Text Document.txt";
            FileWriter fw = new FileWriter(filename, true);
            fw.write("Java Exercises\\n");
            fw.close();
            BufferedReader br = new BufferedReader(new FileReader("/Users/danii/OneDrive/Desktop/bootcamp_2/4_day/New Text Document.txt"));
            while (strLine != null){

                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);

            }
            br.close();

        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());

        }
    }
}
