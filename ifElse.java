import java.util.Scanner;

public class ifElse {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value: ");
        long n = sc.nextLong();

        if (n>0){
            System.out.print("Positive ");
            if (n%2 == 0)
                System.out.print("Even\n");
            else
                System.out.print("Odd\n");
                
            }
            
        
        else if (n<0){
            System.out.print("Negative ");
            if (n%2 == 0)
                System.out.print("Even\n");
                else
                System.out.print("Odd\n");
            
        }
        else {
            System.out.println("Zero");
        }
        sc.close();
    }
    
  
}
