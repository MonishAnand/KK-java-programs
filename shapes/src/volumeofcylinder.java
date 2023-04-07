import java.util.Scanner;

public class volumeofcylinder {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("enter radius:");
        double r =c.nextDouble();
        System.out.println("enter height:");
        double h=c.nextDouble();
        double volume = Math.PI*r*r*h;
        System.out.println("volume of cylinder = "+volume);
    }
}
