import java.util.Scanner;

public class Problem2 {
    // In this question you basically need to do (a && b), (a || b),(!a)
    // code here

    public String booleanOperations(boolean a, boolean b){


         boolean x = a&&b;
         boolean y = a || b;
         boolean z = !a;

         String output = x + " " + y + " " + z;

        return output; 
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("a: ");
        boolean a = sc.nextBoolean();
        System.out.print("b: ");
        boolean b = sc.nextBoolean();

        Problem2 obj = new Problem2();

        String ops = obj.booleanOperations(a, b);
        System.out.println(ops);
        
        sc.close();
    }
}
