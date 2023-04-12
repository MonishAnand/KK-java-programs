import java.util.Scanner;

public class totalsurfareaofcube {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("enter side:");
        double a=c.nextDouble();
        double area=6*a*a;
        System.out.println("Total surface area of a cube = "+area);
    }
}
