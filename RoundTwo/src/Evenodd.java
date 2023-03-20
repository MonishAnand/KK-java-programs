import java.util.*;
public class Evenodd {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("enter a number");
        int n = c.nextInt();
        if (n%2==0){
            System.out.println("it is even");
        }
        else {
            System.out.println("it is odd");
        }
    }
}