import java.util.*;
public class program50 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check palindrome or not");
        int n = sc.nextInt();
        ispalindrome(n);
    }
    public static void ispalindrome(int n){
        int temp = n;
        int reverse = 0;
        int rem;
        while(n>0){
            rem = n % 10;
            reverse = reverse*10 + rem; 
            n = n/10;
        }
        if(temp == reverse){
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("The number is not palindrome");
        }
    }
    
}
