import java.util.*;
public class program60 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0 ;i<n; i++){
            System.out.println("Enter the element of the array");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the index1 of the array to swap");
        int index1 = sc.nextInt();
        System.out.println("Enter the index2 of the array to swap");
        int index2 = sc.nextInt();
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        System.out.println("The array after swapping is:");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        

    
    }
    
}
