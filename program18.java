import java.util.*;
public class program18 {
    public static void main(String args[] ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check prime or not: ");
        int n = sc.nextInt();
        int count = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count = count + 1;
                
            }
        }
        if(count == 2){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
