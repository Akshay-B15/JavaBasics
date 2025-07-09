import java.util.Scanner;

public class Deletethistoo {
    public static void solve() {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        // Perform all the operations and print in a single line
        
        System.out.println((a ^a)+" "+ (c^b)+" "+ (a&b)+" "+ (c|(a^a)));
    }
}