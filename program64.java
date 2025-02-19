import java.util.*;
public class program64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the index1 to swap: ");
        int index1 = sc.nextInt();
        System.out.println("Enter the index2 to swap: ");
        int index2 = sc.nextInt();
        arrswap(arr , index1, index2);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void arrswap(int arr[], int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
    
}
