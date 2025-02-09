import java.util.*;
public class program37 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number to convert to binary");
        int num = sc.nextInt();
        int binary = Convertdecimal(num);
        System.out.println("The converted decimal number to binary is :" + binary);
    }
    public static int Convertdecimal(int num){
        int rem;
        int binary = 0;
        int palace =1;
        while(num>0){
            rem = num % 2;
            binary = binary + rem * palace;
            num = num / 2;
            palace = palace * 10;

        }
        return binary;
    }
    
}
