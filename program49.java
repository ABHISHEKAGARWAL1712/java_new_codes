import java.util.Scanner;
public class program49{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to calculate fibonacci series");
        int n = sc.nextInt();
        int sum = fibonacci(n);
        System.out.println(sum);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
    public static int fibonacci(int n){
        int first = 0;
        int second = 1;
        int sum = 0;
        if(n==0){
            return first;
        }
       else if(n==1){
            return second;
        }
        else{
            for(int i=2;i<=n;i++){
                sum = first + second;
                first = second;
                second = sum;
            }
        
        }
        return sum;
    }
    
}
