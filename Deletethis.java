import java.util.Scanner;

class Deletethis {
    public static int sumOfFirstN(int n) {
        // code here
        int a = ((n)*(n+1))/2;
        return a;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        
        System.out.format("Sum of the first n natural numbers is: %d", sumOfFirstN(n));
        sc.close();
    }
}