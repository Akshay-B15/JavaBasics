import java.util.Scanner;

public class NthtermofGP {
    public static int Nth_term(int a, int r, int N){
        int n = a*(int)(Math.pow(r,N-1));
        return n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(Nth_term(a,r,n));
        sc.close();
    }
}
