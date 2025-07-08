import java.util.Scanner;

public class FIndthelastdigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number n: ");
        int n = sc.nextInt();

        int y = Math.abs(n);
        int ans = y%10;

        System.out.format("The last digit is: %d", ans);
        sc.close();
    }
}
