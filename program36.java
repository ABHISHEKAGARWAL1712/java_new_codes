import java.util.Scanner;
public class program36 {
    public static String addBinary(String a, String b) {
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
        int sum = num1 + num2;
        return Integer.toBinaryString(sum);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input two binary numbers
        System.out.print("Enter first binary number: ");
        String binary1 = scanner.next();
        
        System.out.print("Enter second binary number: ");
        String binary2 = scanner.next();
        
        // Add the binary numbers
        String result = addBinary(binary1, binary2);
        
        // Display the result
        System.out.println("Sum of binary numbers: " + result);

        scanner.close();
    }
}
