import java.util.*;
public class program81{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        //Taking String input
        System.out.println("Enter the string");
        String st = sc.nextLine();               //nextLine() is used to take string input and ready the full line.
        System.out.println(st);



        //Taking character input
        System.out.println("Enter the character");
        char ch = sc.nextLine().charAt(0);
        System.out.println(ch);



    }
}