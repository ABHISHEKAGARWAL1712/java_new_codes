import java.util.*;
public class program63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the element: ");
            arr[i] = sc.nextInt();
        }
        int maximum = arrmax(arr);
        System.out.println(maximum);
    }
    
    public static int arrmax(int arr[]){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    
}
