import java.util.*;
public class currency {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("enter amount in rupees");
        int a = c.nextInt();
        float b = a*0.012f;
        System.out.println("dollor = "+b);
    }
}
