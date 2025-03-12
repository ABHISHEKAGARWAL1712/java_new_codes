import java.util.*;
public class program77 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of rows");
        int n = sc.nextInt();
        System.out.println("Enter the size of colums");
        int m = sc.nextInt();
        int arr[][]= new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.println("enter the element"+ i + " "+ j);
                arr[i][j] = sc.nextInt();
            }
        }

        for(int j=0; j<m; j++){                              //Printing the 2d array in coulmn wise
            for(int i=0; i<n; i++){
                System.out.print(arr[i][j]+ " ");           // Printing the array column wise
            }
            System.out.println();
        }
    }
    
}
