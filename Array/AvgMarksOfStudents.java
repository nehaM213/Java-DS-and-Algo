import java.util.Scanner;

public class AvgMarksOfStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of students");
        int num = sc.nextInt();
        int[] st = new int[num];
        System.out.println("Enter the marks");
        for (int i = 0; i < num; i++) {
            st[i] = sc.nextInt();
        }
        int avg = 0;
        for (int i = 0; i < num; i++) {
            avg += st[i];
        }
        avg /= num;
        System.out.println("Average of marks=" + avg);
    }
}
