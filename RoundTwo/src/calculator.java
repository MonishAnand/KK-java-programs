import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter numbers");
        int a = s.nextInt();
        int b=s.nextInt();
        System.out.println("enter choice");
        System.out.println("1 +");
        System.out.println("2 -");
        System.out.println("3 *");
        System.out.println("4 /");
        int c =s.nextInt();
        if (c==1){
            System.out.println(a+b);
        } else if (c==2) {
            System.out.println(a-b);
        }
        else if (c==3){
            System.out.println(a*b);
        } else if (c==4) {
            System.out.println(a/b);
        }
        else {
            System.out.println("invalid operator");
        }
    }}
