import java.util.*;
public class program58 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element at index "+i);
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The maximum value in tha array is:" + max);
    }
    
}
