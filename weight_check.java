import java.util.*;
public class weight_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight of the person");
        int weight = sc.nextInt();
        if (weight > 80) {
            System.out.println("The person is overweight");
        }
    }
}