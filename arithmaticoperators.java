import java.util.Scanner;

public class arithmaticoperators {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.println("Enter the value of y: ");
        int y = sc.nextInt();

        int p = x + y;
        int q = x - y;
        long r = x*y;
        int s = x/y;
        int t = x%y;

        System.out.format("%d,%d,%d,%d,%d" ,p,q,r,s,t);
        sc.close();

    }
    
}
