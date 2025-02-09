import java.util.Scanner;

public class program38 {
    
    // Function to calculate the sum of Fibonacci series up to n terms
    public static int sumOfFibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 0; // First Fibonacci number is 0

        int first = 0, second = 1, sum = first + second, next;

        for (int i = 3; i <= n; i++) {
            next = first + second;
            sum += next;  // Add the next Fibonacci number to sum
            first = second;
            second = next;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the number of terms
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        
        // Calculate and display the sum
        int result = sumOfFibonacci(n);
        System.out.println("Sum of first " + n + " Fibonacci numbers: " + result);

        scanner.close();
    }
}

