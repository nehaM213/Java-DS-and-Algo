package loops;
import java.util.Scanner;
public class Pattern8 {
//*
//*  *
//*  *  *
//*  *  *  *
//*  *  *
//*  *
//*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rows=2*num-1;
		for(int i=1;i<=rows;i++) {
			if(i<=num) {
				for(int j=1;j<=i;j++) {
				System.out.print("*  ");	
				}
			}
			else {
				for(int j=1;j<=rows-i+1;j++)
				{
					System.out.print("*  ");
				}
			}
			System.out.println();
		}
		
	}
}
