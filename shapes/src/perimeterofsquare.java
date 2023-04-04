import java.util.Scanner;

public class perimeterofsquare {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("enter side:");
        double a=c.nextDouble();
        double peri = 4*a;
        System.out.println("perimeter of square = "+peri);
    }
}
