//Write a Java program to compare two files lexicographically.

import java.io.*;
public class IOExercise6 {
    public static void main(String[] args)
    {   //a=1, b=2, c=3, d=4, e=5
        String str1 = "Java exercises";
        String str2 = "Java exercises";
        String str3 = "Java examples";

        //str1=str2 ==0
        int var1 = str1.compareTo( str2 );
        System.out.println("str1 & str2 comparison: "+var1);

        //str1<str3==4; e=5, a=1 5-1=4
        int var2 = str1.compareTo( str3 );
        System.out.println("str1 & str3 comparison: "+var2);

    }
}