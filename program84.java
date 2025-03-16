import java.util.*;
public class program84 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to reverse");     // Input the string
        String str = sc.nextLine();           // Initialize the string
        int n = str.length();                 // Find the length of the string
        char ch [] = new char[n];             // Initialize the character array of string length
        for(int i=0;i<n;i++){
            ch[i] = str.charAt(i);            // Store the string in character array
        }
        int sp =0;
        int ep = ch.length-1;
        reverse(ch,sp,ep);
    }
    public static void reverse(char ch[],int sp,int ep){
        while(sp<ep){
            char temp = ch[sp];
            ch[sp] = ch[ep];
            ch[ep] = temp;
            sp++;
            ep--;
        }
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }
    }
    
}
