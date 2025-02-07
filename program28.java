import java.util.*;
public class program28 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n and r");
        int n = sc.nextInt();
        int r = sc.nextInt();
        //int diff = n-r;
        int f1 = 1;
        int f2 = 1;
        int f3 = 1;
        for(int i=1; i<=n; i++){
            f1 = f1*i;
        }
        //int f2 = 1;
        for(int i=1; i<=r; i++){
            f2 = f2*i;
        }
        //int f3 = 1;
        for(int i=1; i<=(n-r); i++){
            f3 = f3*i;
        }
        int calulation = f1/(f2*f3);
        System.out.println(calulation);

    }
    
}
