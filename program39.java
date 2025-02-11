import java.util.*;
public class program39 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to number of factors");
        int n = sc.nextInt();
        int nfactor = cfactor(n);
        System.out.println("The number of factor of n is : " + nfactor);
    }
    public static int cfactor(int n){
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }
        return count;
    }
    
}
