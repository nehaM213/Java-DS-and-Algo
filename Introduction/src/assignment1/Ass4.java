package assignment1;
import java.util.Scanner;
//      *
//    * *
//  * * *
//* * * *
//  * * *
//    * *
//      *
public class Ass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(i<=num/2) {
				for(int j=1;j<=(num/2)-(i-1);j++) {
					System.out.print("  ");
				}
				for(int j=1;j<=i;j++) {
					System.out.print(" *");
				}
				System.out.println();
			}
			else {
				for(int j=0;j<=i-(num/2+1);j++)
				{
					System.out.print("  ");
				}
				for(int j=1;j<=(num-i)+1;j++) {
					System.out.print(" *");
				}
				System.out.println();
			}
		}
	}

}
