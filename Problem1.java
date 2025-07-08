import java.util.Scanner;

public class Problem1 {
    public  static int calculate(int a, int b, int c, int d){
        int n = ((a+b)/c)+d;
        return n;
    }
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);

        System.out.print("a: ");
        int a = sc.nextInt();

        System.out.print("b: ");
        int b = sc.nextInt();
        
        System.out.print("c: ");
        int c = sc.nextInt();

        System.out.print("d: ");
        int d = sc.nextInt();

        

        System.out.format("Output is: %d", calculate(a,b,c,d));
        sc.close();
    }
}
