import java.util.*;
public class program43 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number to find ths sum of first n whole numbers");
        int n = sc.nextInt();
        int sum = wfunction(n);
        System.out.println("The sum of first "+n+" whole numbers is "+sum);
    }
    public static int wfunction(int n){
        int sum = 0;
        for(int i=1;i<=n-1;i++){
            sum = sum + i;
        }
        return sum;
    }
    
}
