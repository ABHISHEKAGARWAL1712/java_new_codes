import java.util.*;
public class program32 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to calculate the table");
        int n = sc.nextInt();
        table(n);
    }
    public static void table(int n1){
        for(int i=1; i<=10; i++){
            int a = n1*i;
            System.out.println(n1 + "*" + i + "=" + a);
        }
    }
    
}
