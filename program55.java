import java.util.*;
public class program55 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();            // taking the size of the array from the user in the variabl n
        int [] arr = new int[n];        // intializing the array of the size n given by the user

        for(int i=0; i<n; i++){
            System.out.println("Enter the value of the array" + i);
            arr[i] = sc.nextInt();         //Taking the input od the array from the user means taking the array values from user
        }
        System.out.println(arr[2]);
    }
    
}
