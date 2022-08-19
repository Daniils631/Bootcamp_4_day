import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new
                BufferedReader( new
                InputStreamReader(System.in));
                String s;
        while ((s = in.readLine()) != null && s.length() != 0);
        System.out.println(s);
// An empty line or Ctrl Z terminates
    }
}