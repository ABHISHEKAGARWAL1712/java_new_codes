import java.util.Scanner;
public class program35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input two binary numbers as integers
        System.out.print("Enter first binary number: ");
        int binary1 = scanner.nextInt();
        
        System.out.print("Enter second binary number: ");
        int binary2 = scanner.nextInt();
        
        int sum = 0, carry = 0, place = 1;
        
        // Perform binary addition manually
        while (binary1 > 0 || binary2 > 0 || carry > 0) {
            int digit1 = binary1 % 10;
            int digit2 = binary2 % 10;
            int total = digit1 + digit2 + carry;
            
            sum += (total % 2) * place; // Store binary result
            carry = total / 2;          // Carry for next place
            
            binary1 /= 10;
            binary2 /= 10;
            place *= 10; // Move to next binary digit
        }
        
        // Display the result
        System.out.println("Sum of binary numbers: " + sum);

        scanner.close();
    }
}
 
