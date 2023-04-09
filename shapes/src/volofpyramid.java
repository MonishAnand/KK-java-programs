import java.util.Scanner;

public class volofpyramid {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("enter length :");
        double l =c.nextDouble();
        System.out.println("enter width :");
        double w =c.nextDouble();
        System.out.println("enter height :");
        double h=c.nextDouble();
        double vol=(l*w*h)/3;
        System.out.println("volume of pyramid = "+vol);
    }
}
