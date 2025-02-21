import java.util.*;
public class program69 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the times to rotate the array: ");
        int k = sc.nextInt();
        k = k % arr.length;                       // if k is greater than the size of the array then to find number of rotations we can use this
        int st = 0;
        int et = arr.length-1;
        reverse(arr, st, et);                      // reverse(arr, 0, arr.length-1)
        reverse(arr, st, k-1);                     // reverse(arr, 0, k-1)
        reverse(arr, k, et);                       // reverse(arr, k, arr.length-1)
        System.out.println("The rotated array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void reverse(int arr[], int sp, int ep){
         while(sp<ep){
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }
    }
    
}
