import java.util.*;
public class program40 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to count factor");
        int n = sc.nextInt();
        int ncount = cfactor(n);
        System.out.println("The number of factors of "+n+" is "+ncount);
    }
    public static int cfactor(int n){
        int count = 0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(i!=n/i){
                    count = count + 2;
                }
                else{
                    count = count + 1;
                }
            }
        }
        return count;
    }
    
}
    

