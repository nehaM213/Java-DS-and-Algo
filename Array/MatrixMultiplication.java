import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows and columns of 1st array");
        int rows1 = sc.nextInt();
        int cols1 = sc.nextInt();
        System.out.println("enter number of rows and columns of 2nd array");
        int rows2 = sc.nextInt();
        int cols2 = sc.nextInt();
        int a[][] = new int[rows1][cols1];
        int b[][] = new int[rows2][cols2];
        int c[][] = new int[rows1][cols2];
        int sum = 0;
        System.out.println("Enter array A");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                a[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Enter Array B");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                b[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        if (cols1 == rows2) {
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols2; j++) {
                    for (int k = 0; k < cols1; k++) {
                        sum = sum + a[i][k] * b[k][j];
                    }
                    c[i][j] = sum;
                    sum = 0;
                }
            }
        } else {
            System.out.println("Matrices cannot be multiplied");
        }
        for (int e[] : c) {
            for (int n : e) {
                System.out.print("  " + n + "  ");
            }
            System.out.println();
        }
    }

}
