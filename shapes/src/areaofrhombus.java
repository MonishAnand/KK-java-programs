import java.util.Scanner;

public class areaofrhombus {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("enter diagonals :" );
        int d1=c.nextInt();
        int d2=c.nextInt();
        int area =(d1*d2)/2;
        System.out.println("Area = "+area);
    }
}
