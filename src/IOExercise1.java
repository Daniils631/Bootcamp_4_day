//Write a Java program to get a list of all file/directory names from the given.

import java.util.*;
import java.io.File;
public class IOExercise1 {
    public static void main(String[] args) {
        File file = new File("/Users/danii/OneDrive/Desktop/bootcamp_2/4_day");
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);
    }
}
}
