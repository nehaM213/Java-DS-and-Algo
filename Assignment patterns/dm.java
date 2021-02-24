import java.util.Scanner;

public class dm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println();
        for (int i = 1; i <= num; i++) {
            int temp = num;
            for (int j = 1; j <= i; j++) {
                System.out.print(temp--);
            }
            System.out.println();
        }

    }

}
