import java.util.*;
public class Lcm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a =s.nextInt();
        int b =s.nextInt();
        int c =a;
        while (true){
            if ((a%c==0)&&(b%c==0))
            break;
            else
                c--;
        }
        int lcm = (a*b)/c;
        System.out.println("LCM = "+lcm);
    }
}
