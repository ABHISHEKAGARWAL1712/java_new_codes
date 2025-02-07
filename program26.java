import java.util.*;
public class program26 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find the factorial");
        int num = sc.nextInt();
        int ans = 1;
        for(int i=1; i<=num; i++){
            ans = ans*i;
        }
        System.out.println("The factorial of the number is: "+ans);
    }
}
        