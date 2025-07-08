import java.util.Scanner;

public class DaybeforeNdays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of y: ");
        int y = sc.nextInt();

        int x = y % 7;
        int ans = n - x;

        if (ans > 0){
            System.out.println(ans);
        }
            else{
                System.out.println(ans+7);
            }
            sc.close();
        }
    }


