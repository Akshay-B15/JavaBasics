import java.io.*;

public class bufferinput{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the value of pi: ");
        double a = Double.parseDouble(br.readLine());

        System.out.println("The value of pi is: " + a);

    }
}