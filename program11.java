import java.util.*;
public class program11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check even or odd");
        int num = sc.nextInt();
        if(num == 0){
            System.out.println("The number is zero");
        }
        else if(num%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
        
    }
    
}
