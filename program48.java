import java.util.*;
public class program48 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check prime or not");
        int n = sc.nextInt();
        isprime(n);
    }
    public static void isprime(int n){
        int count = 0;
        for(int i=1; i*i<=n; i++){
            if(n%i==0){
                if(i!=n/i){
                    count = count + 2;
                }
                else{
                    count = count + 1;
                }
            }
        }
        if(count == 2){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a prime number");
        }
    }
    
}
