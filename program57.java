import java.util.*;
public class program57 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the element of the array");
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0; i<n; i++){
            int value = arr[i];
            sum = sum + value;
        }
        System.out.println("The sum of the input array is:" + sum);
    }
    
}
