package loops;
import java.util.Scanner;
public class Pattern7 {
//      1
//    2   3
//  4   5   6
//7   8   9   10
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=1;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num-i;j++) {
				System.out.print("   ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(count+"     ");
				count++;
			}
			System.out.println();
		}
	}

}
