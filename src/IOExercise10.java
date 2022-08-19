//Write a Java program to read contents from a file into byte array.

import java.io.*;

public class IOExercise10 {
    public static void main(String[] args) {
        File file_name = new File("/Users/danii/OneDrive/Desktop/bootcamp_2/4_day/New Text Document.txt");
        InputStream fins = null;
        try{
            fins = new FileInputStream(file_name);
            byte file_content[] = new byte[2*1024];
            int read_count = 0;
            while((read_count = fins.read(file_content))>0){
                System.out.println(new String(file_content, 0, read_count-1));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if(fins != null) fins.close();
            } catch (Exception ex) {
            }
        }
    }
}
