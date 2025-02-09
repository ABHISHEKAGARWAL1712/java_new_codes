import java.util.*;
public class program33 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        double r = sc.nextDouble();
        double pcircle = perimeter(r);
        double parea = area(r);
        System.out.println("Perimeter of the circle is:"+pcircle);
        System.out.println("Area of the circle is:"+parea);
    }
    public static double perimeter(double r){
        double p = 2 * 3.14 * r;
        return p;
    }
    public static double area(double r){
        double a = 3.14 * r * r;
        return a;
    }
    
}
