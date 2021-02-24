package conditionalStatement;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st no.");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		int result=0;
		System.out.println("Enter Operation");
		sc.nextLine();
		char operation=sc.nextLine().charAt(0);
		switch(operation) {
		case '+':
			result=a+b;
			break;
		case '-':
			result=a-b;
			break;
		case '*':
			result=a*b;
			break;
		case '/':
			result=a/b;
		default:
			System.out.println("Invalid operation");
		}
		System.out.println("The result is="+result);
	}

}
