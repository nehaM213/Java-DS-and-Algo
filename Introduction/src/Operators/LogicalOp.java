package Operators;

public class LogicalOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num=40;
//		if( num>=1 && num<=100) {
//			System.out.println("num is in the range");
//		}
//		
//		if( num>=1 & num<=100) {
//			System.out.println("num is in the range");
//		}
//		|| and |
		int grade=10;
//		if(grade==10 || grade==12) {
//			System.out.println("you can give exam");
//		}
//		if(grade==10 | grade==12) {
//			System.out.println("you can give exam");
//		}
//		!
		if(!(grade==10 || grade==12)) {
			System.out.println("you cant give exam");
		}
	}

}
