//Write a java program to read a file line by line and store it into a variable.

import java.io.*;

public class IOExercise13 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        String  strData = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("/Users/danii/OneDrive/Desktop/bootcamp_2/4_day/New Text Document.txt"));
            while (strLine != null){
                if (strLine == null)
                    break;
                strData+=strLine;
                strLine = br.readLine();

            }
            System.out.println(strData);
            br.close();

        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
}
