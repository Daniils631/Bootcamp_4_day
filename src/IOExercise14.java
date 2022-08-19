//Write a java program to read a file line by line and store it into a variable.

import java.io.*;
import java.util.*;

public class IOExercise14 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        List<String> list = new ArrayList<String>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("/Users/danii/OneDrive/Desktop/bootcamp_2/4_day/New Text Document.txt"));
            while (strLine != null){
                strLine = br.readLine();
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                if (strLine==null)
                    break;
                list.add(strLine);

            }
            System.out.println(Arrays.toString(list.toArray()));
            br.close();

        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
}
