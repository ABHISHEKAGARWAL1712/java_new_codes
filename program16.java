import java.util.*;
public class program16 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to reverse");
        int num = sc.nextInt();
        int reverse = 0;
        int temp;
        while(num > 0){
            temp = num % 10;
            reverse = reverse * 10 + temp;
            num = num / 10;
        }
        System.out.println("The reverse of the number is: " + reverse);
    }
    
}
