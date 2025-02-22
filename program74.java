import java.util.*;
public class program74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(maxDifference(arr));
    }
    public static int maxDifference(int arr[]){
        for(int i=0; i<arr.length; i++){
                arr[i] = arr[i] - i;
        }
        int max = arr[0];
        int min = arr[0];
        for(int i=1; i<arr.length; i++){

            if(arr[i]>max){
                max = arr[i];
            }
            else if(arr[i]<min){
                min = arr[i];
            }
        }
        return max - min;
    }
    
}
