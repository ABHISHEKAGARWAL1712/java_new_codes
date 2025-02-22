import java.util.Scanner;

public class program75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the element at index "+i);
            arr[i] = sc.nextInt();
        }
        
        int ans2 = maxdifference_2(arr);                //calculating (arr[i] - arr[j] + i - j) = (arr[i] + i) - (arr[j] + j)= (arr[i]+i)
        int ans3 = maxdifference_3(arr);                //calculating (arr[i] - arr[j] + j - i) = (arr[i] - i) - (arr[j] - j)= (arr[i]-i)
        int max4 = maxdifference_4(ans2, ans3);         //calculating max of ans2 and ans3
        System.out.println(max4);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
    public static int maxdifference_2(int arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i] + i;
        }
        int max = arr[0];
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            else if(arr[i]<min){
                min = arr[i];
            }
        }
        for(int i=0; i<arr.length; i++){              //reverting the array to its original form since we also have to calculate the maxdifference_3 
            arr[i] = arr[i] - i;
        }
        return max - min;
    }
    public static int maxdifference_3(int arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i] - i;
        }
        int max = arr[0];
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            else if(arr[i]<min){
                min = arr[i];
            }
        }
        for(int i=0; i<arr.length; i++){   //reverting the array to its original form
            arr[i] = arr[i] +  i;
        }
        return max - min;
        
    }
    public static int maxdifference_4(int ans2, int ans3){
        if(ans2>ans3){
            return ans2;
        }
        else{
            return ans3;
        }
    }
}

