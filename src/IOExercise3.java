//Write a Java program to check if a file or directory specified by pathname exists or not.

import java.io.*;


public class IOExercise3 {
    public static void main(String[] args) {
        File my_file_dir = new File("/Users/danii/OneDrive/Desktop/bootcamp_2/4_day/New Text Document.txt");
        if(my_file_dir.exists()){
            System.out.println("The directory of file exists.\n");
        }else{
            System.out.println("The directory or file does not exist.\n");
        }
    }
}
