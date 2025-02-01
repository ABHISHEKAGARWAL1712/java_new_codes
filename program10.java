import java.util.*;
public class program10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of the student:");
        int marks = sc.nextInt();
        if(marks >= 35){
            System.out.println("Pass");

        }
        else{
            System.out.println("Fail");
        }
    }
    
}
