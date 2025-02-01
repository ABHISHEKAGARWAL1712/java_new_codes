import java.util.*;
public class program12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check divisible");
        int num = sc.nextInt();
        if(num%2==0 || num%3==0){
            System.out.println("The number is divisible by 2 or 3");
        }
        else{
            System.out.println("The number is not divisible by 2 or 3");
        }
    }
}
