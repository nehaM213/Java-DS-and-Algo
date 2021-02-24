import java.util.Scanner;

public class Ass9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("*");
        for (int i = 2; i < num; i++) {
            System.out.print("*");
            for (int j = 1; j <= i - 2; j++) {
                System.out.print("0");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int i = 1; i <= num; i++) {
            System.out.print("*");
        }
    }
}
