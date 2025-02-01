import java.util.*;
public class program14 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 number to check the greatest number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if(num1==0 && num2==0 && num3==0){
            System.out.println("All the given numbers are 0");
        }
        if(num1>=num2 && num1>=num3){
            System.out.println("num1 is the greatest number");
        }

        else if(num2>=num3){
            System.out.println("num2 is the greatest number");
        }
        else{
            System.out.println("num3 is the greatest number");
        }
    }
    
}
