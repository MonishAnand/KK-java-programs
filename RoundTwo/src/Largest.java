import java.util.*;
public class Largest {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("enter 1st number");
        int a = c.nextInt();
        System.out.println("enter 2nd num");
        int b = c.nextInt();
        if (a>b){
            System.out.println(a+" is largest");
        }
        else {
            System.out.println(b+" is largest");
        }
    }
}
