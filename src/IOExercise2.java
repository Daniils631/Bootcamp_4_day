// Write a Java program to get specific files by extensions from a specified folder
import java.io.File;
import java.io.FilenameFilter;

public class IOExercise2 {
    public static void main(String[] args) {
        // show path to folder which we gona scan
        File file = new File("/Users/danii/OneDrive/Desktop/bootcamp_2/4_day");
        // created array to store faounded file
        String[] list = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.toLowerCase().endsWith(".txt")){
                return true;
                }else{
                    return false;
                }
            }
        });
        for (String f:list){
            System.out.println(f);
        }


    }
}
