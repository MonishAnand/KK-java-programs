import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("Enter Numbers:");
        int x=c.nextInt();
        int y =c.nextInt();
        for (int i=x;i<=y;i++){
            int check=i;
            int sum=0;
            while (check!=0){
                int rem = check%10;
                sum = sum+(rem*rem*rem);
                check = check/10;
            }
            if(sum==i){
                System.out.println(i+"is a armstrong number");
            }
        }
    }
}
