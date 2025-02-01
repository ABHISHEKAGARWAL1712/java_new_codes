public class Type {
    public static void main(String args[]){
        /*int x = 100;
        long y = x;             // Implicit type casting
        System.out.println(y);**/


       /* long x = 10000;
        int y = (int)x;
        System.out.println(y);**/  // Explicit type casting

        long x = 10000000000L;
        int y = (int)x;
        System.out.println(y);  // Explicit type casting but it will give a random number due the range of int 
    }


}
