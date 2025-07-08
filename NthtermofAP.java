import java.util.Scanner;

public class NthtermofAP {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.println("Enter the value of d: ");
        int d = sc.nextInt();

        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        int ans = a + (n-1)*d;

        System.out.format("The Nth term is: %d", ans);
        sc.close();
    }
}
