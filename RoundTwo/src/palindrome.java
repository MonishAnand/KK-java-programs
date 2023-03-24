import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("enter String");
        String original = c.next();
        String reverse ="";
        int lenght = original.length();
        for (int i =lenght-1;i>=0;i--){
            reverse=reverse+original.charAt(i);
        }
        if (original.equals(reverse)){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}
