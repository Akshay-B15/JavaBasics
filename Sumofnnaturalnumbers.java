import java.util.Scanner;

public class Sumofnnaturalnumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        int x = ((n)*(n+1))/2;

        System.out.format("The sum of n natural number is: %d",x);
        sc.close();
    }
}
