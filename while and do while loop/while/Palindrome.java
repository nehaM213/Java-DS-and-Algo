import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0, temp = num, lastDigit = 0;
        while (temp > 0) {
            lastDigit = temp % 10;
            rev = rev * 10 + lastDigit;
            temp /= 10;
        }
        if (num == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
