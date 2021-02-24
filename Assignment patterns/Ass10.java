import java.util.Scanner;

public class Ass10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num - 1; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 1; j <= i - 2; j++) {
                System.out.print(" ");
            }
            if (i > 1)
                System.out.print("*");
            System.out.println();
        }
        for (int i = 1; i <= num; i++) {
            System.out.print("*");
        }
    }
}
