import java.util.*;
public class Simpleinterest {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("enter principle");
        int p = c.nextInt();
        System.out.println("enter time period");
        int t =c.nextInt();
        System.out.println("enter rate");
        int r = c.nextInt();
        int si =p*t*r;
        System.out.println("Simple interest = "+si);
    }
}
