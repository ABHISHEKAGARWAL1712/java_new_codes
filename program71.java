import java.util.*;
public class program71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value to check the pair");
        int k = sc.nextInt();
        boolean ans = twosum(arr, k);
        System.out.println(ans);
    }
    public static boolean twosum(int arr[], int k){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == k){
                    int a = i;
                    int b = j;
                    System.out.println("The pair is: "+a+" "+b);
                    return true;
                }
            }
        }
        return false;
    }
    
}
