import java.util.Scanner;

public class SumOfDigits {
    // wap to find the sum of the digits of a number, 523=10
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0, temp = 0;
        while (num != 0) {
            temp = num % 10;
            sum += temp;
            num /= 10;
        }
        System.out.println(sum);
    }
}
