import java.util.*;
public class program82 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String st = sc.nextLine();
        System.out.println(st.charAt(0));            //reading the 0 index element or character of string
        //similarly we can read any index element of string

        //st.charAt(2) = 'a';      //this will give error as string is immutable
    }
    
}
