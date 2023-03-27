import java.util.Scanner;

public class areaoftriangle {
    public static void main(String[] args) {
        Scanner c= new Scanner(System.in);
        System.out.println("enter height:");
        double h = c.nextDouble();
        System.out.println("enter breadth: ");
        double b = c.nextDouble();
        double area = (h*b)/2;
        System.out.println("Area : "+area);
    }
}
