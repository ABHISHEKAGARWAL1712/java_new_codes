import java.util.*;
public class program17 {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number to find the factor of it");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
    
}
