import java.util.*;
public class program44 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to calculate the sum");
        int n = sc.nextInt();
        int sum = (n*(n-1))/2;
        System.out.println("The sum of first "+n+" whole numbers is "+sum);
    }
    
}
