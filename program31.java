public class program31 {
    public static void main(String args[]){
        int n1 = cube(3);
        System.out.println(add(n1, cube(2)));
    }
    public static int cube(int a){
        return a*a*a;
    }
    public static int add(int a, int b){
        return a+b;
    }
    
}
