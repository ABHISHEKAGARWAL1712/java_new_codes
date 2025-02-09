import java.util.*;
public class program34 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 number to calculate the average");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        double avg = average(n1, n2, n3);
        System.out.println("The average of the 3 number is: "+avg);
    }

    public static double average(int a, int b, int c){
        double avg = (a+b+c)/3;
        return avg;
    }
    
}
