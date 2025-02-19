import java.util.*;
public class program65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(largest(arr));
    }
    public static int largest(int arr[]){
        int max = arr[0];
        int secondmax = arr[0];
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                secondmax = max;
                max = arr[i];
                index = i;
            }
            else if(arr[i]>secondmax){
                secondmax = arr[i];
            }
        }
        if(max>=2*secondmax){
            return index;
        }
        else{
            return -1;
        }
    }
    
}
