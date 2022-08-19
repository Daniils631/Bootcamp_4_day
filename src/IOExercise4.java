//Write a Java program to check if a file or directory has read and write permission.

import java.io.*;


public class IOExercise4 {
    public static void main(String[] args) {
        File my_file_dir = new File("/Users/danii/OneDrive/Desktop/bootcamp_2/4_day/New Text Document.txt");
        if(my_file_dir.canWrite()){
            System.out.println(my_file_dir.getAbsolutePath() + " can write.\n");
        }else{
            System.out.println(my_file_dir.getAbsolutePath() + " cannot write.\n");
        }
        if(my_file_dir.canRead()){
            System.out.println(my_file_dir.getAbsolutePath() + " can read.\n");
        }else{
            System.out.println(my_file_dir.getAbsolutePath() + " cannot read.\n");
        }

    }
}
