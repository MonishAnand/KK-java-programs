import java.util.Scanner;

public class volumeoftriangularprism {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("enter height");
        double h=c.nextDouble();
        System.out.println("enter width");
        double w=c.nextDouble();
        System.out.println("enter length");
        double l=c.nextDouble();
        double vol=(l*h*w)/2;
        System.out.println("volume of triangular prism = "+vol);
    }
}
