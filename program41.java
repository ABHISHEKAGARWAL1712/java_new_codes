import java.util.*;
public class program41 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto which sum is to be calculated:");
        int n = sc.nextInt();
        int sum = sfunction(n);
        System.out.println("Sum of first n natural numbers is:" + sum);
    }

    public static int sfunction(int n){
        int sum1 = 0;
        for(int i=1; i<=n; i++){
            sum1 = sum1 +i;
        }
        return sum1;
    }
    
}
