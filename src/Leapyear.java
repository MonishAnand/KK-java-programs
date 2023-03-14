import java.util.*;
public class Leapyear {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        if (n % 4 == 0){
            System.out.println("it is a leap year");
        }
        else {
            System.out.println("it is not a leap year");
        }
    }
}
