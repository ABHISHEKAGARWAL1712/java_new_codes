import java.util.*;
public class program79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the row of array");
        int n = sc.nextInt();
        System.out.println("Enter the size of the column of array");
        int m = sc.nextInt(); 
        int arr[][] = new int[n][m];          //Intializing the array                        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.println("Enter the element of array" + i + " " + j);         //Taking input from user
                arr[i][j] = sc.nextInt();
            }
        }
        columnwise(arr, n, m);                              //Calling the function
    }
    public static void columnwise(int arr[][], int n, int m){
        for(int j=0; j<m; j++){
            for(int i=0; i<n; i++){
                System.out.print(arr[i][j]+ " ");                       //Printing the array column wise
            }
            System.out.println();
        }
    }
    
}
