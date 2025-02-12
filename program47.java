import java.util.*;
public class program47 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer number to calculate the difference between product and sum of the digits");
        int n = sc.nextInt();
        int diff = ndifference(n);
        System.out.println("The difference between the product and sum of the digits is: "+diff);
    }
    public static int ndifference(int n){
        int sum = 0;
        int product = 1;
        while(n>0){
            int rem = n%10;
            sum = sum + rem;
            product = product * rem;
            n = n/10;
        }
        return (product-sum);
    }
    
}
