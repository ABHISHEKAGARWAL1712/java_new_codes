import java.util.*;
public class program78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size  of row of the array");
        int n = sc.nextInt();
        System.out.println("Enter the size of the column of array");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];             //Initialising the array
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.println("enter the element of the array"+ i + " " + j);
                arr[i][j] = sc.nextInt();              //Taking the input of the array
            }
        }
        rowwise(arr, n , m);                          //Calling the function
        
    }
    public static void rowwise(int arr[][], int n, int m){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j] + " ");                         //Printing the array row wise
            }
            System.out.println();                                          //Changing the line
        }
    }
}

