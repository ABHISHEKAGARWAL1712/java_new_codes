import java.util.*;
public class program30 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int nfact = fact(n);
        System.out.println("Enter the value of r");
        int r = sc.nextInt();
        int rfact = fact(r);
        int nrfact = fact(n-r);
        System.out.println("The value of nCr is: "+(nfact/(rfact*nrfact)));

    }

public static int fact(int n1){
    int ans = 1;
    for(int i=1; i<=n1; i++){
        ans = ans*i;
    }
    return ans;
}
}
