import java.util.*;
public class program56 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the element od the array" + i);
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");         //printing the complete array
        }
    }
    
}
