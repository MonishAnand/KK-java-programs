import java.util.*;
public class cal2 {
    public static void main(String[] args) {
      Scanner c = new Scanner(System.in);
        System.out.println("enter numbers");
      int a = c.nextInt();
      int b=c.nextInt();
        System.out.println("enter operator");
        String s = c.next();
        if (s.equals("+")){
            System.out.println(a+b);
        } else if (s.equals("-")) {
            System.out.println(a-b);
        } else if (s.equals("*")) {
            System.out.println(a*b);
        } else if (s.equals("/")) {
            System.out.println(a/b);
        }
        else {
            System.out.println("invalid operator");
        }
    }
}
