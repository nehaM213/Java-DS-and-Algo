import java.util.Scanner;

public class Ass8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i; j++) {
                for (int k = num - (i - 1); k < num; k++) {
                    System.out.print(k + " ");
                }
                break;
            }
            System.out.print(0 + " ");
            int temp = num - 1;
            for (int k = 1; k <= i - 1; k++) {
                System.out.print((temp--) + " ");
            }
            System.out.println();

        }
    }
}
