package userInput;
import java.util.Scanner;
public class ScannerUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		System.out.println("value="+n);
//		
//		double y=sc.nextDouble();
//		System.out.println("double value"+y);
//		
//		String s=sc.nextLine();
//		System.out.println("String value"+s);
		int principle=sc.nextInt();
		float rate=sc.nextFloat();
		int time=sc.nextInt();
		float simpleInterest=principle*rate*time/100;
		System.out.println("Simple interest is="+simpleInterest);
		
		
	}

}
