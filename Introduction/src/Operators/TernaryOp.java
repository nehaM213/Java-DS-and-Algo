package Operators;

public class TernaryOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// max among 3
		int a=12;
		int b=8;
		int c=100;
		int result;
		result=(a>b)?(a>c)?a:c:(b>c)?b:c;
		System.out.println("max="+result);
	}

}
