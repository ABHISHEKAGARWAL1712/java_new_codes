import java.util.*;
public class program72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the element");    
            arr[i] = sc.nextInt();
        }
        System.out.println(maxdifference_1(arr));
    }
    
    public static int maxdifference_1(int[]arr){
        int max = Integer.MIN_VALUE;                  // max=arr[0] then for loop will start from 1
        int min = Integer.MAX_VALUE;                  // min=arr[0]
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            
            else if (arr[i] < min){
                min = arr[i];
            }
            
        }
        
        return max - min;
    }
}

