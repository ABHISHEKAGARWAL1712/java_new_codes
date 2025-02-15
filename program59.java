import java.util.*;
public class program59 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of  the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the elements of the array");
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The minimum element in the array is "+min);
       
    }
    
}
