import java.util.Scanner;

public class volofrectprism {
    public static void main(String[] args) {
        Scanner c=new Scanner(System.in);
        System.out.println("enter lenght:");
        int l=c.nextInt();
        System.out.println("enter width:");
        int w=c.nextInt();
        System.out.println("enter height");
        int h= c.nextInt();
        int vol=h*l*w;
        System.out.println("volume of Rectangular prism = "+vol);
    }
}
