import java.util.Scanner;

class Problem3 {
    public static int dayBefore(int d, int n) {
        // code here
        int x = n % 7;
        int y = d - x;
        
        if(y>0){
            return y;
        }
        else{
            return(y+7);
        }
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of d: ");
        int d = sc.nextInt();
        
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        
        System.out.format("The result is: %d", dayBefore(d,n));
        sc.close();
    }
}