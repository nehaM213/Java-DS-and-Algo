package loops;
import java.util.Scanner;
public class XToThePowerY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int result=1;
		for(int i=1;i<=y;i++) {
			result*=x;
		}
		System.out.println("result="+result);
	}

}
