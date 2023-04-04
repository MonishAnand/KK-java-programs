import java.util.Scanner;

public class perimeterofrectangle {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("enter lenght:");
        int l=c.nextInt();
        System.out.println("enter breadth:");
        int b =c.nextInt();
        int peri = 2*(l*b);
        System.out.println("Perimeter of rectangle = "+peri);
    }
}
