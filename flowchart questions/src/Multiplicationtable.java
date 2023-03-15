import java.util.Scanner;

public class Multiplicationtable {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        for (int i=1;i<10;i++){
            System.out.println(n+"*"+i+"="+i*n);
        }
    }
}
