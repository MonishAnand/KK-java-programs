import java.util.*;
public class Hcfgcd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter first number");
        int a = s.nextInt();
        System.out.println("enter second number");
        int b = s.nextInt();
        int c=a;
        while (true){
            if ((a%c==0)&&(b%c==0))
                break;
            else
                c--;

        }
        System.out.println("HCF ="+c);
    }
}
