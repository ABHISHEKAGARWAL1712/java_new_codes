import java.util.*;
public class program67 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the element og the array");
            arr[i] = sc.nextInt();
        }
        System.out.println("The second largest element of the array is: "+secondLargest(arr));
    }
    public static int secondLargest(int arr[]){
        int max = arr[0];
        int secondmax = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                secondmax = max;
                max = arr[i];
            }
            else if(arr[i]>secondmax){
                secondmax = arr[i];
            }
        }
        return secondmax;
    }
        
    
}
