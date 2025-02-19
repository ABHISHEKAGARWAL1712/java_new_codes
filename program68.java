import java.util.*;
public class program68 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element of the array");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the starting index to swap the array");
        int st = sc.nextInt();
        System.out.println("Enter the ending index to swap the array");
        int et = sc.nextInt();

        reverse(arr, st, et);
    }
    public static void reverse(int arr[], int sp, int ep){
        while(sp<ep){
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
