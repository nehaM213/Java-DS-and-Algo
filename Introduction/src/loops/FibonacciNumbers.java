package loops;
import java.util.Scanner;
public class FibonacciNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+" ");
		System.out.println(b+" ");
		for(int i=0;i<num-2;i++) {
			int c=a+b;
			System.out.println(c+" ");
			a=b;
			b=c;
		}
	}

}
