import java.util.*;
public class program66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the element: ");
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void reverse(int arr[]){
        int sp = 0;
        int ep = arr.length - 1;
        while(sp<ep){
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            
            sp++;
            ep--;
        }
       
    }
    
}
