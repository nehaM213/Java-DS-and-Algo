package assignment1;
import java.util.Scanner;
public class Ass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(i<=num/2) {
				for(int j=1;j<=(num/2)-(i-1);j++) {
					System.out.print("*");
				}
				for(int j=1;j<=i;j++) {
					System.out.print(" ");
				}
				for(int j=1;j<=i-1;j++) {
					System.out.print(" ");
				}
				for(int j=1;j<=(num/2)-(i-1);j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else {
//				System.out.println(i);
				for(int j=1;j<=i-(num/2+1);j++) {
					System.out.print("*");
				}
				for(int j=1;j<=(num-i)+1;j++) {
					System.out.print(" ");
				}
				for(int j=1;j<=num-i;j++) {
					System.out.print(" ");
				}
				for(int j=1;j<i-num/2;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

}
