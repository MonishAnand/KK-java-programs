import java.util.Scanner;

public class isoscelestri {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter height:");
        int h =s.nextInt();
        System.out.println("enter base:");
        int b=s.nextInt();
        int area = (h*b)/2;
        System.out.println("area :"+area);
    }
}