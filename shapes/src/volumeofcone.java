import java.util.Scanner;

public class volumeofcone {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("enter height :");
        int h =c.nextInt();
        System.out.println("enter radius :");
        int r =c.nextInt();
        double vol=(Math.PI*r*r*h)/3;
        System.out.println("volume of cone = "+vol);

    }
}
