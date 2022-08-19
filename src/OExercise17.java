//Write a Java program to read first 3 lines from a file.

import java.io.*;
import java.util.*;


public class OExercise17 {


    public static void main(String a[]){
        BufferedReader br = null;
        String strLine = "";
        try {
            LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream("/Users/danii/OneDrive/Desktop/bootcamp_2/4_day/New Text Document.txt"), "UTF-8"));
            while (((strLine = reader.readLine()) != null) && reader.getLineNumber() <= 3){
                System.out.println(strLine);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
}
