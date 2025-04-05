import java.util.*;
public class program88 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Enter the element " );
            arr[i] = sc.nextInt();
        }
        int fans = unique(arr);
        System.out.println("The unique element in the array is: " + fans);
    }
    public static int unique(int arr[]){
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            ans = ans ^ arr[i];
        }
        return ans;
    }
    
}
