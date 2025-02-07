import java.util.*;
public class program29 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n and r");
        int n = sc.nextInt();
        int r = sc.nextInt();
        int nfact = 1;
        int nrfact = 1;
        for(int i=1; i<=n; i++){
            nfact = nfact * i;
        }
        for(int i=1; i<=(n-r); i++){
            nrfact = nrfact * i;
        }
        int npr = nfact/nrfact;
        System.out.println("The value of nPr is: "+npr);    
    }
    
}
