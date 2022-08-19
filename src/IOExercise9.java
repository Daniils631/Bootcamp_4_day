//Write a Java program to get file size in bytes, kb, mb.

import java.io.*;

public class IOExercise9 {
    public static void main(String[] args) {
        File file = new File("/Users/danii/OneDrive/Desktop/bootcamp_2/4_day/New Text Document.txt");
        if(file.exists()){
            System.out.println(filesize_in_Bytes(file));
            System.out.println(filesize_in_kiloBytes(file));
            System.out.println(filesize_in_megaBytes(file));
        }
    }
    private static String filesize_in_megaBytes(File file){
        return (double) file.length()/(1024*1024) + " mb";
    }
    private static String filesize_in_kiloBytes(File file) {
        return (double) file.length() / 1024 + " kb";
    }
    private static String filesize_in_Bytes(File file) {
        return (double) file.length() + " bytes";
    }
}
