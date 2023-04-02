import java.util.Scanner;

public class perimeterofcircle {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("enter radius:");
        double r =c.nextDouble();
        double perimeter = 2*Math.PI*r;
        System.out.println("Perimeter = "+perimeter);
    }
}
