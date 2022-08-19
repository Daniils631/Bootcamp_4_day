//Write a Java program to check if given pathname is a directory or a file.

import java.io.*;


public class IOExercise5 {
    public static void main(String[] args) {
        File my_file_dir = new File("/Users/danii/OneDrive/Desktop/bootcamp_2/4_day/New Text Document.txt");
        if(my_file_dir.isDirectory()){
            System.out.println(my_file_dir.getAbsolutePath() + " is directory.\n");
        }else{
            System.out.println(my_file_dir.getAbsolutePath() + " isn't directory.\n");
        }
        if(my_file_dir.isFile()){
            System.out.println(my_file_dir.getAbsolutePath() + " is file.\n");
        }else{
            System.out.println(my_file_dir.getAbsolutePath() + " isn't file.\n");
        }

    }
}
