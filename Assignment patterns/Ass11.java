import java.util.Scanner;

public class Ass11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = 1;
        for (int i = 0; i < num; i++) {

            for (int j = 0; j <= num - i; j++) {
                System.out.print("  ");
            }
            n = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(n + "   ");
                n = n * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

}
