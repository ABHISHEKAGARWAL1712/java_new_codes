import java.util.*;
public class program87{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check odd or even");
        int n = sc.nextInt();
        if((n & 1) == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }

}