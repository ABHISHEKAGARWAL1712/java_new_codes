import java.util.*;
public class program73 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of the array");
          int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the element at index "+i);
            arr[i] = sc.nextInt();
        }
        System.out.println(maxdifference_1(arr));
       
    }
    public static int maxdifference_1(int arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i]+i;
        }
        int max = arr[0];
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return max-min;
    }
        
    
}
