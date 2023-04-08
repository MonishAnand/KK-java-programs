import java.util.Scanner;

public class volofsphere {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("enter radius value :");
        double r = c.nextDouble();
        double vol = (4*Math.PI*r*r*r)/3;
        System.out.println("volume of sphere = "+vol);
    }
}
