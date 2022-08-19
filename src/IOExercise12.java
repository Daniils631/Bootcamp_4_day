//Write a Java program to read a plain text file

import java.io.*;

public class IOExercise12 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("/Users/danii/OneDrive/Desktop/bootcamp_2/4_day/New Text Document.txt"));
            while (strLine != null){
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }

        } catch (FileNotFoundException e) {
            System.err.println();
        }catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
}
