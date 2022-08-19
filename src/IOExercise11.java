//Write a Java program to read a file content line by line.

import java.io.*;

public class IOExercise11 {
    public static void main(String[] args) {
        BufferedReader br = null;
        String strLine = "";
        try {
            br = new BufferedReader(new FileReader("/Users/danii/OneDrive/Desktop/bootcamp_2/4_day/New Text Document.txt"));
            while ((strLine = br.readLine()) != null){
                System.out.println(strLine);
            }
            br.close();
        }   catch (FileNotFoundException e){
            System.err.println("Fille not found");
        }
        catch (IOException e){
            System.err.println("Unable to read this file");
        }
    }
}
