import java.util.*;
public class program13 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check divisibility");
        int num = sc.nextInt();
        if(num%2==0 && num%3==0){
            System.out.println("The number is divisible by 2 and 3");
        }
        else{
            System.out.println("The number is not divisible by 2 and 3");
        }
    }
    
}
