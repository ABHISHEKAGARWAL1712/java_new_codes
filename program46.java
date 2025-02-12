import java.util.*;
public class program46 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to calculate the floor of a sqrt of that number");
        int n = sc.nextInt();
        int floor = sqrt(n);
        System.out.println("The floor of sqrt of "+n+" is "+floor);
    }
    public static int sqrt(int n){
        int ans = 1;
        int i =1;
        while(i*i<=n){
            ans = i;
            i++;
        }
        return ans;
    }
    
}
