import java.util.Scanner;

public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("enter side :");
        double a =c.nextDouble();
        double perimeter = 3*a;
        System.out.println("perimeter = "+perimeter);
    }
}
