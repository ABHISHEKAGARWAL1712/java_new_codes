import java.util.*;
public class program51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check perfect square");
        int n = sc.nextInt();
        perfectsqr(n);
    }
    public static void perfectsqr(int n){
        int ans = 1;
        int i = 1;
        int temp = n;
        while(i*i<=n){
            ans = i;
            i++;
        }
        if(ans*ans == temp){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
