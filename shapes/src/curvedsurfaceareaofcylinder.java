import java.util.Scanner;

public class curvedsurfaceareaofcylinder {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("enter radius");
        double r =c.nextDouble();
        System.out.println("enter height");
        double h= c.nextDouble();
        double area=2*Math.PI*r*h;
        System.out.println("Curved surface area of cylinder = "+area);
    }
}
