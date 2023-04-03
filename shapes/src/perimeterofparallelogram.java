import java.util.Scanner;

public class perimeterofparallelogram {
    public static void main(String[] args) {
            Scanner c = new Scanner(System.in);
            System.out.println("enter base");
            int b = c.nextInt();
            System.out.println("enter side");
            int a=c.nextInt();
            int perimeter = 2*(a+b);
            System.out.println("perimeter = "+perimeter);
        }
    }


