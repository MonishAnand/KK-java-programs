import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args) {
        Scanner c= new Scanner(System.in);
        System.out.println("enter radius:");
        double r =c.nextDouble();
        double area = (r*r)*Math.PI;
        System.out.println("Area:"+area);
    }
}