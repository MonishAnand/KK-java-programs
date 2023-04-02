import java.util.Scanner;

public class areaofequilateraltriangle {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("enter side");
        double a=c.nextDouble();
        double area= (Math.sqrt(3)*(a*a))/4;
        System.out.println("Area = "+area);
    }
}
