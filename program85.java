import java.util.*;
public class program85 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String st = sc.nextLine();
        System.out.println(insert(st));
    }
    public static String insert(String st){
        int n = st.length();
        String ans = "";
        for(int i=0; i<n-1; i++){
            ans = ans + st.charAt(i);
            int temp = st.charAt(i+1) - st.charAt(i);
            ans = ans + temp;
        }
        ans = ans + st.charAt(n-1);
        return ans;
    }
    
}
