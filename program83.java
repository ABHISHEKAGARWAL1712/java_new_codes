import java.util.*;
public class program83 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String st = sc.nextLine();
        int n = st.length();                    //Finding the length of the string  
        char ch[] = new char[n];              //Intializing the character array of length of string
                   
        for(int i=0; i<n; i++){
            ch[i] = st.charAt(i);                //Storing the string in the character array
        }
        toggle(ch);
    }
    public static void toggle(char ch[]){
        for(int i=0; i<ch.length; i++){
            if(ch[i]>=65 && ch[i]<=90){                   //Checking the character is in the range of A-Z for uppercase
                ch[i] = (char)(ch[i] + 32);               //Converting the uppercase to lowercase
            }
            else{
                ch[i] = (char)(ch[i]-32);                     //Converting the lowercase to uppercase
            }
        }
        for(int i=0; i<ch.length; i++){
            System.out.print(ch[i]);
        }
    }
}
