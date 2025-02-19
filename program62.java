import java.util.*;
public class program62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element at position "+i);
            arr[i] = sc.nextInt();
        }
        int total = sum(arr);
        System.out.println("The sum of the array is:" + total);
    }
    public static int sum(int arr[]){
        int sum1 = 0;
        for(int i=0; i<arr.length; i++){
            sum1 = sum1 + arr[i];
        }
        return sum1;
    }

    
}
