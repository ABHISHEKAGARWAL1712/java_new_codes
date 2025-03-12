import java.util.*;
public class program80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the rows of the array");
        int n = sc.nextInt();
        System.out.println("Enter the size of the columns of the array");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];               //Decalaring  the array
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.println("Enter the element at position " + i + " " + j);
                arr[i][j] = sc.nextInt();                
            }
        }
        zigzag(arr, n, m);          //calling the function
    }
    public static void zigzag(int arr[][], int n, int m){
        for(int i=0; i<n; i++){
            if(i%2==0){                                     //Checking if the row is even or odd
                for(int j=0; j<m; j++){
                    System.out.print(arr[i][j] + " ");             //Printing the element of the array in row wise for even row
                }
            }
            else{
                for(int j=m-1; j>=0; j--){
                    System.out.print(arr[i][j] + " ");            //Printing the element of the array in row wise from the back for odd row
                }
            }
            System.out.println();
        }
    }
}
